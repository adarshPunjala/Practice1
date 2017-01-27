Add-PsSnapin Microsoft.SharePoint.PowerShell

 ## SharePoint DLL 
 [void][System.Reflection.Assembly]::LoadWithPartialName("Microsoft.SharePoint") 

 #Creating Sub Sites in top site collection.
 Write-Output " "
 Write-Output "Creating Sub Sites"

$SiteCollectionURL = "http://mevm-ms-train/sites/Departments1/IT1"

$SiteCollectionTemplate = "STS#0" 

$SiteCollectionLanguage = 1033

$SubSites = @("Support1", "Training1" )

 for($i=0 ; $i -lt $SubSites.count ; $i++)
 {
 $SiteUrl = ""
 $SiteUrl = $SiteCollectionURL + "/" 
 $SiteUrl = $SiteUrl += $SubSites[$i]
 Write-Output " "
 #Write-Output "Creating Site for " += $SubSites[$i]
 Write-Output " "
 New-SPWeb $SiteUrl -Template $SiteCollectionTemplate -Name $SubSites[$i]  -UseParentTopNav -Language $SiteCollectionLanguage
 Write-Output " "
 #Write-Output "Site Created for " += $SubSites[$i]
 Write-Output " "
 }

 Remove-PsSnapin Microsoft.SharePoint.PowerShell