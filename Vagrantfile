# -*- mode: ruby -*-
# vi: set ft=ruby :

VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.provider "virtualbox" do |v|
    v.name = "clojurl-dev-env"
  end
  #networking 
  config.vm.network "forwarded_port", guest: 3001, host: 3001, auto_correct: true
  config.vm.hostname = "clojurl-dev-env"

  #provisioning
  config.vm.provision :shell, path: "bootstrap.sh"
end
