package com.github.grimpy.jenkins.plugins.lxc.builder;

def f = namespace(lib.FormTagLib);

f.entry() {
    f.dropdownDescriptorSelector(title:_("Action to choose"), field:"option",
            descriptors: descriptor.getOptionList())
}