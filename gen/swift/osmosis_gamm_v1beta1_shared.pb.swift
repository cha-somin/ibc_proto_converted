// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/gamm/v1beta1/shared.proto
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

/// MigrationRecords contains all the links between balancer and concentrated
/// pools
struct Osmosis_Gamm_V1beta1_MigrationRecords {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var balancerToConcentratedPoolLinks: [Osmosis_Gamm_V1beta1_BalancerToConcentratedPoolLink] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// BalancerToConcentratedPoolLink defines a single link between a single
/// balancer pool and a single concentrated liquidity pool. This link is used to
/// allow a balancer pool to migrate to a single canonical full range
/// concentrated liquidity pool position
/// A balancer pool can be linked to a maximum of one cl pool, and a cl pool can
/// be linked to a maximum of one balancer pool.
struct Osmosis_Gamm_V1beta1_BalancerToConcentratedPoolLink {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var balancerPoolID: UInt64 = 0

  var clPoolID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Osmosis_Gamm_V1beta1_MigrationRecords: @unchecked Sendable {}
extension Osmosis_Gamm_V1beta1_BalancerToConcentratedPoolLink: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.gamm.v1beta1"

extension Osmosis_Gamm_V1beta1_MigrationRecords: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MigrationRecords"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "balancer_to_concentrated_pool_links"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.balancerToConcentratedPoolLinks) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.balancerToConcentratedPoolLinks.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.balancerToConcentratedPoolLinks, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Gamm_V1beta1_MigrationRecords, rhs: Osmosis_Gamm_V1beta1_MigrationRecords) -> Bool {
    if lhs.balancerToConcentratedPoolLinks != rhs.balancerToConcentratedPoolLinks {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Gamm_V1beta1_BalancerToConcentratedPoolLink: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BalancerToConcentratedPoolLink"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "balancer_pool_id"),
    2: .standard(proto: "cl_pool_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.balancerPoolID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.clPoolID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.balancerPoolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.balancerPoolID, fieldNumber: 1)
    }
    if self.clPoolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.clPoolID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Gamm_V1beta1_BalancerToConcentratedPoolLink, rhs: Osmosis_Gamm_V1beta1_BalancerToConcentratedPoolLink) -> Bool {
    if lhs.balancerPoolID != rhs.balancerPoolID {return false}
    if lhs.clPoolID != rhs.clPoolID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}