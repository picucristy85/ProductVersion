# ProductVersion
Our software version number uses the following template: [Major number].[Minor number].[BugFix number][-BranchNameAndNumber]
Requirement: Create a method that will return the "production version" (production version = version without the [-BranchNameAndNumber]) from a list of versions.
e.g. Input = {"2.5.0-dev.1", "2.4.2-5354", "2.4.2-test.675", "2.4.1-integration.1"}
desired Output = 2.4.2-5354
