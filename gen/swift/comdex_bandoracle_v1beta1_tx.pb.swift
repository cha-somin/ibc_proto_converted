// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: comdex/bandoracle/v1beta1/tx.proto
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

struct Comdex_Bandoracle_V1beta1_MsgFetchPriceData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var creator: String = String()

  var oracleScriptID: UInt64 = 0

  var sourceChannel: String = String()

  var calldata: Comdex_Bandoracle_V1beta1_FetchPriceCallData {
    get {return _calldata ?? Comdex_Bandoracle_V1beta1_FetchPriceCallData()}
    set {_calldata = newValue}
  }
  /// Returns true if `calldata` has been explicitly set.
  var hasCalldata: Bool {return self._calldata != nil}
  /// Clears the value of `calldata`. Subsequent reads from it will return its default value.
  mutating func clearCalldata() {self._calldata = nil}

  var askCount: UInt64 = 0

  var minCount: UInt64 = 0

  var feeLimit: [Cosmos_Base_V1beta1_Coin] = []

  var requestKey: String = String()

  var prepareGas: UInt64 = 0

  var executeGas: UInt64 = 0

  var clientID: String = String()

  var twaBatchSize: UInt64 = 0

  var acceptedHeightDiff: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _calldata: Comdex_Bandoracle_V1beta1_FetchPriceCallData? = nil
}

struct Comdex_Bandoracle_V1beta1_MsgFetchPriceDataResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Comdex_Bandoracle_V1beta1_MsgFetchPriceData: @unchecked Sendable {}
extension Comdex_Bandoracle_V1beta1_MsgFetchPriceDataResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "comdex.bandoracle.v1beta1"

extension Comdex_Bandoracle_V1beta1_MsgFetchPriceData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgFetchPriceData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "creator"),
    2: .standard(proto: "oracle_script_id"),
    3: .standard(proto: "source_channel"),
    4: .same(proto: "calldata"),
    5: .standard(proto: "ask_count"),
    6: .standard(proto: "min_count"),
    7: .standard(proto: "fee_limit"),
    8: .standard(proto: "request_key"),
    9: .standard(proto: "prepare_gas"),
    10: .standard(proto: "execute_gas"),
    11: .standard(proto: "client_id"),
    12: .standard(proto: "twa_batch_size"),
    13: .standard(proto: "accepted_height_diff"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.oracleScriptID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.sourceChannel) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._calldata) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.askCount) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.minCount) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.feeLimit) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.requestKey) }()
      case 9: try { try decoder.decodeSingularUInt64Field(value: &self.prepareGas) }()
      case 10: try { try decoder.decodeSingularUInt64Field(value: &self.executeGas) }()
      case 11: try { try decoder.decodeSingularStringField(value: &self.clientID) }()
      case 12: try { try decoder.decodeSingularUInt64Field(value: &self.twaBatchSize) }()
      case 13: try { try decoder.decodeSingularInt64Field(value: &self.acceptedHeightDiff) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 1)
    }
    if self.oracleScriptID != 0 {
      try visitor.visitSingularUInt64Field(value: self.oracleScriptID, fieldNumber: 2)
    }
    if !self.sourceChannel.isEmpty {
      try visitor.visitSingularStringField(value: self.sourceChannel, fieldNumber: 3)
    }
    try { if let v = self._calldata {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    if self.askCount != 0 {
      try visitor.visitSingularUInt64Field(value: self.askCount, fieldNumber: 5)
    }
    if self.minCount != 0 {
      try visitor.visitSingularUInt64Field(value: self.minCount, fieldNumber: 6)
    }
    if !self.feeLimit.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.feeLimit, fieldNumber: 7)
    }
    if !self.requestKey.isEmpty {
      try visitor.visitSingularStringField(value: self.requestKey, fieldNumber: 8)
    }
    if self.prepareGas != 0 {
      try visitor.visitSingularUInt64Field(value: self.prepareGas, fieldNumber: 9)
    }
    if self.executeGas != 0 {
      try visitor.visitSingularUInt64Field(value: self.executeGas, fieldNumber: 10)
    }
    if !self.clientID.isEmpty {
      try visitor.visitSingularStringField(value: self.clientID, fieldNumber: 11)
    }
    if self.twaBatchSize != 0 {
      try visitor.visitSingularUInt64Field(value: self.twaBatchSize, fieldNumber: 12)
    }
    if self.acceptedHeightDiff != 0 {
      try visitor.visitSingularInt64Field(value: self.acceptedHeightDiff, fieldNumber: 13)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Bandoracle_V1beta1_MsgFetchPriceData, rhs: Comdex_Bandoracle_V1beta1_MsgFetchPriceData) -> Bool {
    if lhs.creator != rhs.creator {return false}
    if lhs.oracleScriptID != rhs.oracleScriptID {return false}
    if lhs.sourceChannel != rhs.sourceChannel {return false}
    if lhs._calldata != rhs._calldata {return false}
    if lhs.askCount != rhs.askCount {return false}
    if lhs.minCount != rhs.minCount {return false}
    if lhs.feeLimit != rhs.feeLimit {return false}
    if lhs.requestKey != rhs.requestKey {return false}
    if lhs.prepareGas != rhs.prepareGas {return false}
    if lhs.executeGas != rhs.executeGas {return false}
    if lhs.clientID != rhs.clientID {return false}
    if lhs.twaBatchSize != rhs.twaBatchSize {return false}
    if lhs.acceptedHeightDiff != rhs.acceptedHeightDiff {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Bandoracle_V1beta1_MsgFetchPriceDataResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgFetchPriceDataResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Bandoracle_V1beta1_MsgFetchPriceDataResponse, rhs: Comdex_Bandoracle_V1beta1_MsgFetchPriceDataResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
