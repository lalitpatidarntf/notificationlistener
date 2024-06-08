import com.myproject.MyNotificationPackage; // Add this import

@Override
protected List<ReactPackage> getPackages() {
    @SuppressWarnings("UnnecessaryLocalVariable")
    List<ReactPackage> packages = new PackageList(this).getPackages();
    packages.add(new MyNotificationPackage()); // Add this line
    return packages;
}
