// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: noble/tariff/params.proto
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

/// Params defines the set of params for the distribution module.
struct Noble_Tariff_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// share is % of tx fees or rewards allocated to distribution_entities 
  var share: String = String()

  /// % of tx fees or rewards allocated to a set of global distribution entities
  /// these shares must add up to 1
  var distributionEntities: [Noble_Tariff_DistributionEntity] = []

  var transferFeeBps: String = String()

  var transferFeeMax: String = String()

  var transferFeeDenom: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// DistributionEntity defines a distribution entity
struct Noble_Tariff_DistributionEntity {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: String = String()

  var share: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Noble_Tariff_Params: @unchecked Sendable {}
extension Noble_Tariff_DistributionEntity: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "noble.tariff"

extension Noble_Tariff_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "share"),
    2: .standard(proto: "distribution_entities"),
    3: .standard(proto: "transfer_fee_bps"),
    4: .standard(proto: "transfer_fee_max"),
    5: .standard(proto: "transfer_fee_denom"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.share) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.distributionEntities) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.transferFeeBps) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.transferFeeMax) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.transferFeeDenom) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.share.isEmpty {
      try visitor.visitSingularStringField(value: self.share, fieldNumber: 1)
    }
    if !self.distributionEntities.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.distributionEntities, fieldNumber: 2)
    }
    if !self.transferFeeBps.isEmpty {
      try visitor.visitSingularStringField(value: self.transferFeeBps, fieldNumber: 3)
    }
    if !self.transferFeeMax.isEmpty {
      try visitor.visitSingularStringField(value: self.transferFeeMax, fieldNumber: 4)
    }
    if !self.transferFeeDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.transferFeeDenom, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Noble_Tariff_Params, rhs: Noble_Tariff_Params) -> Bool {
    if lhs.share != rhs.share {return false}
    if lhs.distributionEntities != rhs.distributionEntities {return false}
    if lhs.transferFeeBps != rhs.transferFeeBps {return false}
    if lhs.transferFeeMax != rhs.transferFeeMax {return false}
    if lhs.transferFeeDenom != rhs.transferFeeDenom {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Noble_Tariff_DistributionEntity: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DistributionEntity"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .same(proto: "share"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.share) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if !self.share.isEmpty {
      try visitor.visitSingularStringField(value: self.share, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Noble_Tariff_DistributionEntity, rhs: Noble_Tariff_DistributionEntity) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.share != rhs.share {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}