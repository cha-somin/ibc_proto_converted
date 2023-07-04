// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: comdex/bandoracle/v1beta1/fetch_price.proto
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

struct Comdex_Bandoracle_V1beta1_FetchPriceCallData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var symbols: [String] = []

  var multiplier: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Bandoracle_V1beta1_FetchPriceResult {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var rates: [UInt64] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Bandoracle_V1beta1_Market {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var symbol: String = String()

  var scriptID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Comdex_Bandoracle_V1beta1_DiscardData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var blockHeight: Int64 = 0

  var discardBool: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Comdex_Bandoracle_V1beta1_FetchPriceCallData: @unchecked Sendable {}
extension Comdex_Bandoracle_V1beta1_FetchPriceResult: @unchecked Sendable {}
extension Comdex_Bandoracle_V1beta1_Market: @unchecked Sendable {}
extension Comdex_Bandoracle_V1beta1_DiscardData: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "comdex.bandoracle.v1beta1"

extension Comdex_Bandoracle_V1beta1_FetchPriceCallData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FetchPriceCallData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "symbols"),
    2: .same(proto: "multiplier"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedStringField(value: &self.symbols) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.multiplier) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.symbols.isEmpty {
      try visitor.visitRepeatedStringField(value: self.symbols, fieldNumber: 1)
    }
    if self.multiplier != 0 {
      try visitor.visitSingularUInt64Field(value: self.multiplier, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Bandoracle_V1beta1_FetchPriceCallData, rhs: Comdex_Bandoracle_V1beta1_FetchPriceCallData) -> Bool {
    if lhs.symbols != rhs.symbols {return false}
    if lhs.multiplier != rhs.multiplier {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Bandoracle_V1beta1_FetchPriceResult: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FetchPriceResult"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "rates"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedUInt64Field(value: &self.rates) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.rates.isEmpty {
      try visitor.visitPackedUInt64Field(value: self.rates, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Bandoracle_V1beta1_FetchPriceResult, rhs: Comdex_Bandoracle_V1beta1_FetchPriceResult) -> Bool {
    if lhs.rates != rhs.rates {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Bandoracle_V1beta1_Market: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Market"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "symbol"),
    2: .standard(proto: "script_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.symbol) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.scriptID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.symbol.isEmpty {
      try visitor.visitSingularStringField(value: self.symbol, fieldNumber: 1)
    }
    if self.scriptID != 0 {
      try visitor.visitSingularUInt64Field(value: self.scriptID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Bandoracle_V1beta1_Market, rhs: Comdex_Bandoracle_V1beta1_Market) -> Bool {
    if lhs.symbol != rhs.symbol {return false}
    if lhs.scriptID != rhs.scriptID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Comdex_Bandoracle_V1beta1_DiscardData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DiscardData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "block_height"),
    2: .standard(proto: "discard_bool"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.blockHeight) }()
      case 2: try { try decoder.decodeSingularBoolField(value: &self.discardBool) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.blockHeight != 0 {
      try visitor.visitSingularInt64Field(value: self.blockHeight, fieldNumber: 1)
    }
    if self.discardBool != false {
      try visitor.visitSingularBoolField(value: self.discardBool, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Comdex_Bandoracle_V1beta1_DiscardData, rhs: Comdex_Bandoracle_V1beta1_DiscardData) -> Bool {
    if lhs.blockHeight != rhs.blockHeight {return false}
    if lhs.discardBool != rhs.discardBool {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}