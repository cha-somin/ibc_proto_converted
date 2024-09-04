// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/smartaccount/v1beta1/params.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

/// Params defines the parameters for the module.
struct Osmosis_Smartaccount_V1beta1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// MaximumUnauthenticatedGas defines the maximum amount of gas that can be
  /// used to authenticate a transaction in ante handler without having fee payer
  /// authenticated.
  var maximumUnauthenticatedGas: UInt64 = 0

  /// IsSmartAccountActive defines the state of the authenticator.
  /// If set to false, the authenticator module will not be used
  /// and the classic cosmos sdk authentication will be used instead.
  var isSmartAccountActive: Bool = false

  /// CircuitBreakerControllers defines list of addresses that are allowed to
  /// set is_smart_account_active without going through governance.
  var circuitBreakerControllers: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Osmosis_Smartaccount_V1beta1_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.smartaccount.v1beta1"

extension Osmosis_Smartaccount_V1beta1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "maximum_unauthenticated_gas"),
    2: .standard(proto: "is_smart_account_active"),
    3: .standard(proto: "circuit_breaker_controllers"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.maximumUnauthenticatedGas) }()
      case 2: try { try decoder.decodeSingularBoolField(value: &self.isSmartAccountActive) }()
      case 3: try { try decoder.decodeRepeatedStringField(value: &self.circuitBreakerControllers) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.maximumUnauthenticatedGas != 0 {
      try visitor.visitSingularUInt64Field(value: self.maximumUnauthenticatedGas, fieldNumber: 1)
    }
    if self.isSmartAccountActive != false {
      try visitor.visitSingularBoolField(value: self.isSmartAccountActive, fieldNumber: 2)
    }
    if !self.circuitBreakerControllers.isEmpty {
      try visitor.visitRepeatedStringField(value: self.circuitBreakerControllers, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Smartaccount_V1beta1_Params, rhs: Osmosis_Smartaccount_V1beta1_Params) -> Bool {
    if lhs.maximumUnauthenticatedGas != rhs.maximumUnauthenticatedGas {return false}
    if lhs.isSmartAccountActive != rhs.isSmartAccountActive {return false}
    if lhs.circuitBreakerControllers != rhs.circuitBreakerControllers {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
