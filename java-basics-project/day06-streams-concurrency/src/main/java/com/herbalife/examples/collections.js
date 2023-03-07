let numbers = [100, 200, 300, 400, 500];

//Filter the numbers > 250, square them and print them
numbers
    .filter(num => {
        console.log("***Filter " + num);
        return num > 250;
    })
    .map(num => {
        console.log("***Map " + num);
        return num * num;
    })
    .forEach(num => console.log(num));