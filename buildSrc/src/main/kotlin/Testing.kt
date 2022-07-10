object Testing {
    private const val junitVersion = "4.13.2"
    const val junit4 = "junit:junit:$junitVersion"

    private const val junitAndroidExtVersion = "1.1.3"
    const val junitAndroidExt = "androidx.test.ext:junit:$junitAndroidExtVersion"

    private const val espressoVersion = "3.4.0"
    const val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"

    const val composeUiTest = "androidx.compose.ui:ui-test-junit4:${Compose.composeVersion}"
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest:${Compose.composeVersion}"
}