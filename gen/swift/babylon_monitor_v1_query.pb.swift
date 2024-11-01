// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: babylon/monitor/v1/query.proto
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

/// QueryEndedEpochBtcHeightRequest defines a query type for EndedEpochBtcHeight
/// RPC method
struct Babylon_Monitor_V1_QueryEndedEpochBtcHeightRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var epochNum: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryEndedEpochBtcHeightResponse defines a response type for
/// EndedEpochBtcHeight RPC method
struct Babylon_Monitor_V1_QueryEndedEpochBtcHeightResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// height of btc light client when epoch ended
  var btcLightClientHeight: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryReportedCheckpointBtcHeightRequest defines a query type for
/// ReportedCheckpointBtcHeight RPC method
struct Babylon_Monitor_V1_QueryReportedCheckpointBtcHeightRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// ckpt_hash is hex encoded byte string of the hash of the checkpoint
  var ckptHash: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryReportedCheckpointBtcHeightResponse defines a response type for
/// ReportedCheckpointBtcHeight RPC method
struct Babylon_Monitor_V1_QueryReportedCheckpointBtcHeightResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// height of btc light client when checkpoint is reported
  var btcLightClientHeight: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Babylon_Monitor_V1_QueryEndedEpochBtcHeightRequest: @unchecked Sendable {}
extension Babylon_Monitor_V1_QueryEndedEpochBtcHeightResponse: @unchecked Sendable {}
extension Babylon_Monitor_V1_QueryReportedCheckpointBtcHeightRequest: @unchecked Sendable {}
extension Babylon_Monitor_V1_QueryReportedCheckpointBtcHeightResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "babylon.monitor.v1"

extension Babylon_Monitor_V1_QueryEndedEpochBtcHeightRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryEndedEpochBtcHeightRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "epoch_num"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.epochNum) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.epochNum != 0 {
      try visitor.visitSingularUInt64Field(value: self.epochNum, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Monitor_V1_QueryEndedEpochBtcHeightRequest, rhs: Babylon_Monitor_V1_QueryEndedEpochBtcHeightRequest) -> Bool {
    if lhs.epochNum != rhs.epochNum {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Monitor_V1_QueryEndedEpochBtcHeightResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryEndedEpochBtcHeightResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "btc_light_client_height"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.btcLightClientHeight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.btcLightClientHeight != 0 {
      try visitor.visitSingularUInt32Field(value: self.btcLightClientHeight, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Monitor_V1_QueryEndedEpochBtcHeightResponse, rhs: Babylon_Monitor_V1_QueryEndedEpochBtcHeightResponse) -> Bool {
    if lhs.btcLightClientHeight != rhs.btcLightClientHeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Monitor_V1_QueryReportedCheckpointBtcHeightRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryReportedCheckpointBtcHeightRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "ckpt_hash"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.ckptHash) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.ckptHash.isEmpty {
      try visitor.visitSingularStringField(value: self.ckptHash, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Monitor_V1_QueryReportedCheckpointBtcHeightRequest, rhs: Babylon_Monitor_V1_QueryReportedCheckpointBtcHeightRequest) -> Bool {
    if lhs.ckptHash != rhs.ckptHash {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Monitor_V1_QueryReportedCheckpointBtcHeightResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryReportedCheckpointBtcHeightResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "btc_light_client_height"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.btcLightClientHeight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.btcLightClientHeight != 0 {
      try visitor.visitSingularUInt32Field(value: self.btcLightClientHeight, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Monitor_V1_QueryReportedCheckpointBtcHeightResponse, rhs: Babylon_Monitor_V1_QueryReportedCheckpointBtcHeightResponse) -> Bool {
    if lhs.btcLightClientHeight != rhs.btcLightClientHeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
