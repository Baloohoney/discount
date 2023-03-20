fun main() {
    val isUserMember = true
    val sum: Int = 1250
    val discountRegular: Int = 100
    val discountExtra: Double = 0.05
    val discountMember: Double = 0.99

    var sumTotal =
        if (isUserMember) {
            if (sum in 1001..10_000) {
                (sum - discountRegular) * discountMember
            } else if (sum > 10_000) {
                (sum - (sum * discountExtra)) * discountMember
            } else 0
        } else {
            if (sum in 1001..10_000) {
                sum - discountRegular
            } else if (sum > 10_000) {
                sum - (sum * discountExtra)
            } else 0
        }

    val cartTotal = "Цена покупки с учетом скидки $sumTotal руб."
    println(cartTotal)
}