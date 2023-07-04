// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: sommelier/auction/v1/tx.proto
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

struct Auction_V1_MsgSubmitBidRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var auctionID: UInt32 = 0

  var signer: String = String()

  var maxBidInUsomm: Cosmos_Base_V1beta1_Coin {
    get {return _maxBidInUsomm ?? Cosmos_Base_V1beta1_Coin()}
    set {_maxBidInUsomm = newValue}
  }
  /// Returns true if `maxBidInUsomm` has been explicitly set.
  var hasMaxBidInUsomm: Bool {return self._maxBidInUsomm != nil}
  /// Clears the value of `maxBidInUsomm`. Subsequent reads from it will return its default value.
  mutating func clearMaxBidInUsomm() {self._maxBidInUsomm = nil}

  var saleTokenMinimumAmount: Cosmos_Base_V1beta1_Coin {
    get {return _saleTokenMinimumAmount ?? Cosmos_Base_V1beta1_Coin()}
    set {_saleTokenMinimumAmount = newValue}
  }
  /// Returns true if `saleTokenMinimumAmount` has been explicitly set.
  var hasSaleTokenMinimumAmount: Bool {return self._saleTokenMinimumAmount != nil}
  /// Clears the value of `saleTokenMinimumAmount`. Subsequent reads from it will return its default value.
  mutating func clearSaleTokenMinimumAmount() {self._saleTokenMinimumAmount = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _maxBidInUsomm: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _saleTokenMinimumAmount: Cosmos_Base_V1beta1_Coin? = nil
}

struct Auction_V1_MsgSubmitBidResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var bid: Auction_V1_Bid {
    get {return _bid ?? Auction_V1_Bid()}
    set {_bid = newValue}
  }
  /// Returns true if `bid` has been explicitly set.
  var hasBid: Bool {return self._bid != nil}
  /// Clears the value of `bid`. Subsequent reads from it will return its default value.
  mutating func clearBid() {self._bid = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _bid: Auction_V1_Bid? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Auction_V1_MsgSubmitBidRequest: @unchecked Sendable {}
extension Auction_V1_MsgSubmitBidResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "auction.v1"

extension Auction_V1_MsgSubmitBidRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSubmitBidRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "auction_id"),
    2: .same(proto: "signer"),
    3: .standard(proto: "max_bid_in_usomm"),
    4: .standard(proto: "sale_token_minimum_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.auctionID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.signer) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._maxBidInUsomm) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._saleTokenMinimumAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.auctionID != 0 {
      try visitor.visitSingularUInt32Field(value: self.auctionID, fieldNumber: 1)
    }
    if !self.signer.isEmpty {
      try visitor.visitSingularStringField(value: self.signer, fieldNumber: 2)
    }
    try { if let v = self._maxBidInUsomm {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._saleTokenMinimumAmount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Auction_V1_MsgSubmitBidRequest, rhs: Auction_V1_MsgSubmitBidRequest) -> Bool {
    if lhs.auctionID != rhs.auctionID {return false}
    if lhs.signer != rhs.signer {return false}
    if lhs._maxBidInUsomm != rhs._maxBidInUsomm {return false}
    if lhs._saleTokenMinimumAmount != rhs._saleTokenMinimumAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Auction_V1_MsgSubmitBidResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSubmitBidResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "bid"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._bid) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._bid {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Auction_V1_MsgSubmitBidResponse, rhs: Auction_V1_MsgSubmitBidResponse) -> Bool {
    if lhs._bid != rhs._bid {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}