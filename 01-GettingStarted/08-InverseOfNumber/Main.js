function inverseOfNumber(n) {
    var inverse = 0;
    var idx = 0;
    while (n != 0) {
        idx++;
        var digit = n % 10;
        n = Math.floor(n / 10);
        var pow = Math.pow(10, digit - 1);
        var num = idx * pow;
        inverse = num + inverse;
    }
    return inverse;
}
console.log(inverseOfNumber(28346751));
