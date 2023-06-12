// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: likechain/likenft/v1/params.proto
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
struct Likechain_Likenft_V1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var priceDenom: String = String()

  var feePerByte: Cosmos_Base_V1beta1_DecCoin {
    get {return _feePerByte ?? Cosmos_Base_V1beta1_DecCoin()}
    set {_feePerByte = newValue}
  }
  /// Returns true if `feePerByte` has been explicitly set.
  var hasFeePerByte: Bool {return self._feePerByte != nil}
  /// Clears the value of `feePerByte`. Subsequent reads from it will return its default value.
  mutating func clearFeePerByte() {self._feePerByte = nil}

  var maxOfferDurationDays: UInt64 = 0

  var maxListingDurationDays: UInt64 = 0

  var maxRoyaltyBasisPoints: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _feePerByte: Cosmos_Base_V1beta1_DecCoin? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Likechain_Likenft_V1_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "likechain.likenft.v1"

extension Likechain_Likenft_V1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "price_denom"),
    2: .standard(proto: "fee_per_byte"),
    3: .standard(proto: "max_offer_duration_days"),
    4: .standard(proto: "max_listing_duration_days"),
    5: .standard(proto: "max_royalty_basis_points"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.priceDenom) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._feePerByte) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.maxOfferDurationDays) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.maxListingDurationDays) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.maxRoyaltyBasisPoints) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.priceDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.priceDenom, fieldNumber: 1)
    }
    try { if let v = self._feePerByte {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if self.maxOfferDurationDays != 0 {
      try visitor.visitSingularUInt64Field(value: self.maxOfferDurationDays, fieldNumber: 3)
    }
    if self.maxListingDurationDays != 0 {
      try visitor.visitSingularUInt64Field(value: self.maxListingDurationDays, fieldNumber: 4)
    }
    if self.maxRoyaltyBasisPoints != 0 {
      try visitor.visitSingularUInt64Field(value: self.maxRoyaltyBasisPoints, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Likechain_Likenft_V1_Params, rhs: Likechain_Likenft_V1_Params) -> Bool {
    if lhs.priceDenom != rhs.priceDenom {return false}
    if lhs._feePerByte != rhs._feePerByte {return false}
    if lhs.maxOfferDurationDays != rhs.maxOfferDurationDays {return false}
    if lhs.maxListingDurationDays != rhs.maxListingDurationDays {return false}
    if lhs.maxRoyaltyBasisPoints != rhs.maxRoyaltyBasisPoints {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
