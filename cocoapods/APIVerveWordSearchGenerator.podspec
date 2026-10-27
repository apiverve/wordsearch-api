Pod::Spec.new do |s|
  s.name             = 'APIVerveWordSearchGenerator'
  s.version          = '1.2.3'
  s.summary          = 'Word Search Generator is a word search API that creates customizable word search puzzles with configurable grid size, word placement,...'
  s.description      = <<-'DESC'
Word Search Generator is a word search API that creates customizable word search puzzles with configurable grid size, word placement, and difficulty levels.

This iOS/macOS SDK provides a convenient way to access the Word Search Generator from APIVerve.
Supports both callback-based and async/await patterns.
                       DESC

  s.homepage         = 'https://apiverve.com/marketplace/wordsearch?utm_source=cocoapods&utm_medium=referral&utm_content=homepage'
  s.license          = { :type => 'MIT', :file => 'LICENSE' }
  s.author           = { 'APIVerve' => 'hello@apiverve.com' }
  # The SDK repo holds every language; the pod lives under cocoapods/ with its own tag.
  s.source           = { :git => 'https://github.com/apiverve/wordsearch-api.git', :tag => "cocoapods/v#{s.version}" }

  s.ios.deployment_target = '15.0'
  s.osx.deployment_target = '12.0'

  s.swift_version = '5.0'

  s.source_files = 'cocoapods/Sources/APIVerveWordSearchGenerator/**/*.swift'

  s.frameworks = 'Foundation'

  # APIResponse, APIVerveError and the request plumbing, shared by every APIVerve pod.
  s.dependency 'APIVerveCore', '~> 1.2'
end
