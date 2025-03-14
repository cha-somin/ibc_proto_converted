// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: zrchain/validation/asset_data.proto
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

/// Asset is an enum that represents the assets we store pricing for
enum Zrchain_Validation_Asset: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case unspecified // = 0
  case rock // = 1
  case zenBtc // = 2
  case stEth // = 3
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .rock
    case 2: self = .zenBtc
    case 3: self = .stEth
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .rock: return 1
    case .zenBtc: return 2
    case .stEth: return 3
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Zrchain_Validation_Asset: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Zrchain_Validation_Asset] = [
    .unspecified,
    .rock,
    .zenBtc,
    .stEth,
  ]
}

#endif  // swift(>=4.2)

/// AssetData is a struct that contains the price in USD + decimals of precision of an asset
struct Zrchain_Validation_AssetData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var asset: Zrchain_Validation_Asset = .unspecified

  var priceUsd: String = String()

  var precision: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Zrchain_Validation_Asset: @unchecked Sendable {}
extension Zrchain_Validation_AssetData: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "zrchain.validation"

extension Zrchain_Validation_Asset: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "UNSPECIFIED"),
    1: .same(proto: "ROCK"),
    2: .same(proto: "zenBTC"),
    3: .same(proto: "stETH"),
  ]
}

extension Zrchain_Validation_AssetData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AssetData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "asset"),
    2: .same(proto: "priceUSD"),
    3: .same(proto: "precision"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularEnumField(value: &self.asset) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.priceUsd) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.precision) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.asset != .unspecified {
      try visitor.visitSingularEnumField(value: self.asset, fieldNumber: 1)
    }
    if !self.priceUsd.isEmpty {
      try visitor.visitSingularStringField(value: self.priceUsd, fieldNumber: 2)
    }
    if self.precision != 0 {
      try visitor.visitSingularUInt32Field(value: self.precision, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Zrchain_Validation_AssetData, rhs: Zrchain_Validation_AssetData) -> Bool {
    if lhs.asset != rhs.asset {return false}
    if lhs.priceUsd != rhs.priceUsd {return false}
    if lhs.precision != rhs.precision {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
