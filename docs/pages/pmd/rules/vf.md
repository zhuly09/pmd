---
title: Salesforce VisualForce Rules
tags: [rule_references, vf]
summary: Index of all built-in rules available for Salesforce VisualForce
language_name: Salesforce VisualForce
permalink: pmd_rules_vf.html
folder: pmd/rules
---
## Security

{% include callout.html content="Rules that flag potential security flaws." %}

*   [VfCsrf](pmd_rules_vf_security.html#vfcsrf): Avoid calling VF action upon page load as the action becomes vulnerable to CSRF.
*   [VfUnescapeEl](pmd_rules_vf_security.html#vfunescapeel): Avoid unescaped user controlled content in EL as it results in XSS.

## Additional rulesets

*   Basic VF (`rulesets/vf/security.xml`):

    <span style="border-radius: 0.25em; color: #fff; padding: 0.2em 0.6em 0.3em; display: inline; background-color: #d9534f; font-size: 75%;">Deprecated</span>  This ruleset is for backwards compatibility.

    It contains the following rules:

    [VfCsrf](pmd_rules_vf_security.html#vfcsrf), [VfUnescapeEl](pmd_rules_vf_security.html#vfunescapeel)


