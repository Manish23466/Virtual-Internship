function calculateAge(birthDateStr) {
    const birthDate = new Date(birthDateStr);
    const currentDate = new Date();
    
    const yearsDiff = currentDate.getFullYear() - birthDate.getFullYear();
    const monthsDiff = currentDate.getMonth() - birthDate.getMonth();
    const daysDiff = currentDate.getDate() - birthDate.getDate();
    
    if (monthsDiff < 0 || (monthsDiff === 0 && daysDiff < 0)) {
        yearsDiff--;
        if (monthsDiff < 0) {
            monthsDiff += 12;
        }
        if (daysDiff < 0) {
            const lastMonthDate = new Date(currentDate.getFullYear(), currentDate.getMonth() - 1, birthDate.getDate());
            daysDiff = Math.floor((currentDate - lastMonthDate) / (1000 * 60 * 60 * 24));
        }
    }
    
    return { years: yearsDiff, months: monthsDiff, days: daysDiff };
}
const birthDateStr = '2003-08-28';
const age = calculateAge(birthDateStr);
console.log(`Age: ${age.years} years, ${age.months} months, ${age.days} days`);
