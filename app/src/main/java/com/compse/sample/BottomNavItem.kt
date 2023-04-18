package com.compse.sample

sealed class BottomNavItem(val titleResId: Int, val iconResId: Int, val screenRoute: String) {
    object HomeTab :
        BottomNavItem(
            R.string.tab_home,
            R.drawable.ic_baseline_home_24,
            BottomNavRouter.HOME
        )

    object InvestmentTab :
        BottomNavItem(
            R.string.tab_investment,
            R.drawable.ic_baseline_insert_chart_24,
            BottomNavRouter.INVESTMENT
        )

    object CashTab :
        BottomNavItem(
            R.string.tab_cash,
            R.drawable.ic_baseline_sync_alt_24,
            BottomNavRouter.CASH
        )

    object ProfileTab :
        BottomNavItem(
            R.string.tab_profile,
            R.drawable.ic_baseline_person_24,
            BottomNavRouter.PROFILE
        )
}
