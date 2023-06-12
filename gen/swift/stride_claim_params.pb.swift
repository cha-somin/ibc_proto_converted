// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stride/claim/params.proto
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

/// Params defines the claim module's parameters.
struct Stride_Claim_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var airdrops: [Stride_Claim_Airdrop] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stride_Claim_Airdrop {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var airdropIdentifier: String = String()

  var chainID: String = String()

  /// seconds
  var airdropStartTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _airdropStartTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_airdropStartTime = newValue}
  }
  /// Returns true if `airdropStartTime` has been explicitly set.
  var hasAirdropStartTime: Bool {return self._airdropStartTime != nil}
  /// Clears the value of `airdropStartTime`. Subsequent reads from it will return its default value.
  mutating func clearAirdropStartTime() {self._airdropStartTime = nil}

  /// seconds
  var airdropDuration: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _airdropDuration ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_airdropDuration = newValue}
  }
  /// Returns true if `airdropDuration` has been explicitly set.
  var hasAirdropDuration: Bool {return self._airdropDuration != nil}
  /// Clears the value of `airdropDuration`. Subsequent reads from it will return its default value.
  mutating func clearAirdropDuration() {self._airdropDuration = nil}

  /// denom of claimable asset
  var claimDenom: String = String()

  /// airdrop distribution account
  var distributorAddress: String = String()

  /// ustrd tokens claimed so far in the current period
  var claimedSoFar: String = String()

  /// indicates the airdrop should be claimed via autopilot
  var autopilotEnabled: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _airdropStartTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _airdropDuration: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stride_Claim_Params: @unchecked Sendable {}
extension Stride_Claim_Airdrop: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stride.claim"

extension Stride_Claim_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "airdrops"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.airdrops) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.airdrops.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.airdrops, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stride_Claim_Params, rhs: Stride_Claim_Params) -> Bool {
    if lhs.airdrops != rhs.airdrops {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stride_Claim_Airdrop: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Airdrop"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "airdrop_identifier"),
    7: .standard(proto: "chain_id"),
    2: .standard(proto: "airdrop_start_time"),
    3: .standard(proto: "airdrop_duration"),
    4: .standard(proto: "claim_denom"),
    5: .standard(proto: "distributor_address"),
    6: .standard(proto: "claimed_so_far"),
    8: .standard(proto: "autopilot_enabled"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.airdropIdentifier) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._airdropStartTime) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._airdropDuration) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.claimDenom) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.distributorAddress) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.claimedSoFar) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.chainID) }()
      case 8: try { try decoder.decodeSingularBoolField(value: &self.autopilotEnabled) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.airdropIdentifier.isEmpty {
      try visitor.visitSingularStringField(value: self.airdropIdentifier, fieldNumber: 1)
    }
    try { if let v = self._airdropStartTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._airdropDuration {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if !self.claimDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.claimDenom, fieldNumber: 4)
    }
    if !self.distributorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.distributorAddress, fieldNumber: 5)
    }
    if !self.claimedSoFar.isEmpty {
      try visitor.visitSingularStringField(value: self.claimedSoFar, fieldNumber: 6)
    }
    if !self.chainID.isEmpty {
      try visitor.visitSingularStringField(value: self.chainID, fieldNumber: 7)
    }
    if self.autopilotEnabled != false {
      try visitor.visitSingularBoolField(value: self.autopilotEnabled, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stride_Claim_Airdrop, rhs: Stride_Claim_Airdrop) -> Bool {
    if lhs.airdropIdentifier != rhs.airdropIdentifier {return false}
    if lhs.chainID != rhs.chainID {return false}
    if lhs._airdropStartTime != rhs._airdropStartTime {return false}
    if lhs._airdropDuration != rhs._airdropDuration {return false}
    if lhs.claimDenom != rhs.claimDenom {return false}
    if lhs.distributorAddress != rhs.distributorAddress {return false}
    if lhs.claimedSoFar != rhs.claimedSoFar {return false}
    if lhs.autopilotEnabled != rhs.autopilotEnabled {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
