// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: sommelier/incentives/v1/genesis.proto
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

struct Incentives_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Incentives_V1_Params {
    get {return _params ?? Incentives_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Incentives_V1_Params? = nil
}

/// Params incentives parameters
struct Incentives_V1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// DistributionPerBlock defines the coin to be sent to the distribution module from the community pool every block
  var distributionPerBlock: Cosmos_Base_V1beta1_Coin {
    get {return _distributionPerBlock ?? Cosmos_Base_V1beta1_Coin()}
    set {_distributionPerBlock = newValue}
  }
  /// Returns true if `distributionPerBlock` has been explicitly set.
  var hasDistributionPerBlock: Bool {return self._distributionPerBlock != nil}
  /// Clears the value of `distributionPerBlock`. Subsequent reads from it will return its default value.
  mutating func clearDistributionPerBlock() {self._distributionPerBlock = nil}

  /// IncentivesCutoffHeight defines the block height after which the incentives module will stop sending coins to the distribution module from
  /// the community pool
  var incentivesCutoffHeight: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _distributionPerBlock: Cosmos_Base_V1beta1_Coin? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Incentives_V1_GenesisState: @unchecked Sendable {}
extension Incentives_V1_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "incentives.v1"

extension Incentives_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Incentives_V1_GenesisState, rhs: Incentives_V1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Incentives_V1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "distribution_per_block"),
    2: .standard(proto: "incentives_cutoff_height"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._distributionPerBlock) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.incentivesCutoffHeight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._distributionPerBlock {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if self.incentivesCutoffHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.incentivesCutoffHeight, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Incentives_V1_Params, rhs: Incentives_V1_Params) -> Bool {
    if lhs._distributionPerBlock != rhs._distributionPerBlock {return false}
    if lhs.incentivesCutoffHeight != rhs.incentivesCutoffHeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
