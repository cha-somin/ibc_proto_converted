// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: neutron/interchainqueries/params.proto
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
struct Neutron_Interchainqueries_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Defines amount of blocks required before query becomes available for
  /// removal by anybody
  var querySubmitTimeout: UInt64 = 0

  /// Amount of coins deposited for the query.
  var queryDeposit: [Cosmos_Base_V1beta1_Coin] = []

  /// Amount of tx hashes to be removed during a single EndBlock. Can vary to
  /// balance between network cleaning speed and EndBlock duration. A zero value
  /// means no limit.
  var txQueryRemovalLimit: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Neutron_Interchainqueries_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "neutron.interchainqueries"

extension Neutron_Interchainqueries_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "query_submit_timeout"),
    2: .standard(proto: "query_deposit"),
    3: .standard(proto: "tx_query_removal_limit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.querySubmitTimeout) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.queryDeposit) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.txQueryRemovalLimit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.querySubmitTimeout != 0 {
      try visitor.visitSingularUInt64Field(value: self.querySubmitTimeout, fieldNumber: 1)
    }
    if !self.queryDeposit.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.queryDeposit, fieldNumber: 2)
    }
    if self.txQueryRemovalLimit != 0 {
      try visitor.visitSingularUInt64Field(value: self.txQueryRemovalLimit, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Neutron_Interchainqueries_Params, rhs: Neutron_Interchainqueries_Params) -> Bool {
    if lhs.querySubmitTimeout != rhs.querySubmitTimeout {return false}
    if lhs.queryDeposit != rhs.queryDeposit {return false}
    if lhs.txQueryRemovalLimit != rhs.txQueryRemovalLimit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
