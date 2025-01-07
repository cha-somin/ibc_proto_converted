// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: thorchain/v1/x/thorchain/types/type_network.proto
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

struct Types_Network {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var bondRewardRune: String = String()

  var totalBondUnits: String = String()

  var lpincomeSplit: Int64 = 0

  var nodeIncomeSplit: Int64 = 0

  var outboundGasSpentRune: UInt64 = 0

  var outboundGasWithheldRune: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Types_Network: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "types"

extension Types_Network: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Network"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "bond_reward_rune"),
    2: .standard(proto: "total_bond_units"),
    5: .same(proto: "LPIncomeSplit"),
    6: .same(proto: "NodeIncomeSplit"),
    7: .standard(proto: "outbound_gas_spent_rune"),
    8: .standard(proto: "outbound_gas_withheld_rune"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.bondRewardRune) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.totalBondUnits) }()
      case 5: try { try decoder.decodeSingularInt64Field(value: &self.lpincomeSplit) }()
      case 6: try { try decoder.decodeSingularInt64Field(value: &self.nodeIncomeSplit) }()
      case 7: try { try decoder.decodeSingularUInt64Field(value: &self.outboundGasSpentRune) }()
      case 8: try { try decoder.decodeSingularUInt64Field(value: &self.outboundGasWithheldRune) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.bondRewardRune.isEmpty {
      try visitor.visitSingularStringField(value: self.bondRewardRune, fieldNumber: 1)
    }
    if !self.totalBondUnits.isEmpty {
      try visitor.visitSingularStringField(value: self.totalBondUnits, fieldNumber: 2)
    }
    if self.lpincomeSplit != 0 {
      try visitor.visitSingularInt64Field(value: self.lpincomeSplit, fieldNumber: 5)
    }
    if self.nodeIncomeSplit != 0 {
      try visitor.visitSingularInt64Field(value: self.nodeIncomeSplit, fieldNumber: 6)
    }
    if self.outboundGasSpentRune != 0 {
      try visitor.visitSingularUInt64Field(value: self.outboundGasSpentRune, fieldNumber: 7)
    }
    if self.outboundGasWithheldRune != 0 {
      try visitor.visitSingularUInt64Field(value: self.outboundGasWithheldRune, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Types_Network, rhs: Types_Network) -> Bool {
    if lhs.bondRewardRune != rhs.bondRewardRune {return false}
    if lhs.totalBondUnits != rhs.totalBondUnits {return false}
    if lhs.lpincomeSplit != rhs.lpincomeSplit {return false}
    if lhs.nodeIncomeSplit != rhs.nodeIncomeSplit {return false}
    if lhs.outboundGasSpentRune != rhs.outboundGasSpentRune {return false}
    if lhs.outboundGasWithheldRune != rhs.outboundGasWithheldRune {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}