// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: akash/market/v1beta3/bid.proto
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

/// MsgCreateBid defines an SDK message for creating Bid
struct Akash_Market_V1beta3_MsgCreateBid {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var order: Akash_Market_V1beta3_OrderID {
    get {return _order ?? Akash_Market_V1beta3_OrderID()}
    set {_order = newValue}
  }
  /// Returns true if `order` has been explicitly set.
  var hasOrder: Bool {return self._order != nil}
  /// Clears the value of `order`. Subsequent reads from it will return its default value.
  mutating func clearOrder() {self._order = nil}

  var provider: String = String()

  var price: Cosmos_Base_V1beta1_DecCoin {
    get {return _price ?? Cosmos_Base_V1beta1_DecCoin()}
    set {_price = newValue}
  }
  /// Returns true if `price` has been explicitly set.
  var hasPrice: Bool {return self._price != nil}
  /// Clears the value of `price`. Subsequent reads from it will return its default value.
  mutating func clearPrice() {self._price = nil}

  var deposit: Cosmos_Base_V1beta1_Coin {
    get {return _deposit ?? Cosmos_Base_V1beta1_Coin()}
    set {_deposit = newValue}
  }
  /// Returns true if `deposit` has been explicitly set.
  var hasDeposit: Bool {return self._deposit != nil}
  /// Clears the value of `deposit`. Subsequent reads from it will return its default value.
  mutating func clearDeposit() {self._deposit = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _order: Akash_Market_V1beta3_OrderID? = nil
  fileprivate var _price: Cosmos_Base_V1beta1_DecCoin? = nil
  fileprivate var _deposit: Cosmos_Base_V1beta1_Coin? = nil
}

/// MsgCreateBidResponse defines the Msg/CreateBid response type.
struct Akash_Market_V1beta3_MsgCreateBidResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgCloseBid defines an SDK message for closing bid
struct Akash_Market_V1beta3_MsgCloseBid {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var bidID: Akash_Market_V1beta3_BidID {
    get {return _bidID ?? Akash_Market_V1beta3_BidID()}
    set {_bidID = newValue}
  }
  /// Returns true if `bidID` has been explicitly set.
  var hasBidID: Bool {return self._bidID != nil}
  /// Clears the value of `bidID`. Subsequent reads from it will return its default value.
  mutating func clearBidID() {self._bidID = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _bidID: Akash_Market_V1beta3_BidID? = nil
}

/// MsgCloseBidResponse defines the Msg/CloseBid response type.
struct Akash_Market_V1beta3_MsgCloseBidResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// BidID stores owner and all other seq numbers
/// A successful bid becomes a Lease(ID).
struct Akash_Market_V1beta3_BidID {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var owner: String = String()

  var dseq: UInt64 = 0

  var gseq: UInt32 = 0

  var oseq: UInt32 = 0

  var provider: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Bid stores BidID, state of bid and price
struct Akash_Market_V1beta3_Bid {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var bidID: Akash_Market_V1beta3_BidID {
    get {return _bidID ?? Akash_Market_V1beta3_BidID()}
    set {_bidID = newValue}
  }
  /// Returns true if `bidID` has been explicitly set.
  var hasBidID: Bool {return self._bidID != nil}
  /// Clears the value of `bidID`. Subsequent reads from it will return its default value.
  mutating func clearBidID() {self._bidID = nil}

  var state: Akash_Market_V1beta3_Bid.State = .invalid

  var price: Cosmos_Base_V1beta1_DecCoin {
    get {return _price ?? Cosmos_Base_V1beta1_DecCoin()}
    set {_price = newValue}
  }
  /// Returns true if `price` has been explicitly set.
  var hasPrice: Bool {return self._price != nil}
  /// Clears the value of `price`. Subsequent reads from it will return its default value.
  mutating func clearPrice() {self._price = nil}

  var createdAt: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  /// State is an enum which refers to state of bid
  enum State: SwiftProtobuf.Enum {
    typealias RawValue = Int

    /// Prefix should start with 0 in enum. So declaring dummy state
    case invalid // = 0

    /// BidOpen denotes state for bid open
    case `open` // = 1

    /// BidMatched denotes state for bid open
    case active // = 2

    /// BidLost denotes state for bid lost
    case lost // = 3

    /// BidClosed denotes state for bid closed
    case closed // = 4
    case UNRECOGNIZED(Int)

    init() {
      self = .invalid
    }

    init?(rawValue: Int) {
      switch rawValue {
      case 0: self = .invalid
      case 1: self = .open
      case 2: self = .active
      case 3: self = .lost
      case 4: self = .closed
      default: self = .UNRECOGNIZED(rawValue)
      }
    }

    var rawValue: Int {
      switch self {
      case .invalid: return 0
      case .open: return 1
      case .active: return 2
      case .lost: return 3
      case .closed: return 4
      case .UNRECOGNIZED(let i): return i
      }
    }

  }

  init() {}

  fileprivate var _bidID: Akash_Market_V1beta3_BidID? = nil
  fileprivate var _price: Cosmos_Base_V1beta1_DecCoin? = nil
}

#if swift(>=4.2)

extension Akash_Market_V1beta3_Bid.State: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Akash_Market_V1beta3_Bid.State] = [
    .invalid,
    .open,
    .active,
    .lost,
    .closed,
  ]
}

#endif  // swift(>=4.2)

/// BidFilters defines flags for bid list filter
struct Akash_Market_V1beta3_BidFilters {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var owner: String = String()

  var dseq: UInt64 = 0

  var gseq: UInt32 = 0

  var oseq: UInt32 = 0

  var provider: String = String()

  var state: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Akash_Market_V1beta3_MsgCreateBid: @unchecked Sendable {}
extension Akash_Market_V1beta3_MsgCreateBidResponse: @unchecked Sendable {}
extension Akash_Market_V1beta3_MsgCloseBid: @unchecked Sendable {}
extension Akash_Market_V1beta3_MsgCloseBidResponse: @unchecked Sendable {}
extension Akash_Market_V1beta3_BidID: @unchecked Sendable {}
extension Akash_Market_V1beta3_Bid: @unchecked Sendable {}
extension Akash_Market_V1beta3_Bid.State: @unchecked Sendable {}
extension Akash_Market_V1beta3_BidFilters: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "akash.market.v1beta3"

extension Akash_Market_V1beta3_MsgCreateBid: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateBid"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "order"),
    2: .same(proto: "provider"),
    3: .same(proto: "price"),
    4: .same(proto: "deposit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._order) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.provider) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._price) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._deposit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._order {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.provider.isEmpty {
      try visitor.visitSingularStringField(value: self.provider, fieldNumber: 2)
    }
    try { if let v = self._price {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._deposit {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Market_V1beta3_MsgCreateBid, rhs: Akash_Market_V1beta3_MsgCreateBid) -> Bool {
    if lhs._order != rhs._order {return false}
    if lhs.provider != rhs.provider {return false}
    if lhs._price != rhs._price {return false}
    if lhs._deposit != rhs._deposit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Market_V1beta3_MsgCreateBidResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateBidResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Market_V1beta3_MsgCreateBidResponse, rhs: Akash_Market_V1beta3_MsgCreateBidResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Market_V1beta3_MsgCloseBid: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCloseBid"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "bid_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._bidID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._bidID {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Market_V1beta3_MsgCloseBid, rhs: Akash_Market_V1beta3_MsgCloseBid) -> Bool {
    if lhs._bidID != rhs._bidID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Market_V1beta3_MsgCloseBidResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCloseBidResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Market_V1beta3_MsgCloseBidResponse, rhs: Akash_Market_V1beta3_MsgCloseBidResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Market_V1beta3_BidID: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BidID"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .same(proto: "dseq"),
    3: .same(proto: "gseq"),
    4: .same(proto: "oseq"),
    5: .same(proto: "provider"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.dseq) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.gseq) }()
      case 4: try { try decoder.decodeSingularUInt32Field(value: &self.oseq) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.provider) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 1)
    }
    if self.dseq != 0 {
      try visitor.visitSingularUInt64Field(value: self.dseq, fieldNumber: 2)
    }
    if self.gseq != 0 {
      try visitor.visitSingularUInt32Field(value: self.gseq, fieldNumber: 3)
    }
    if self.oseq != 0 {
      try visitor.visitSingularUInt32Field(value: self.oseq, fieldNumber: 4)
    }
    if !self.provider.isEmpty {
      try visitor.visitSingularStringField(value: self.provider, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Market_V1beta3_BidID, rhs: Akash_Market_V1beta3_BidID) -> Bool {
    if lhs.owner != rhs.owner {return false}
    if lhs.dseq != rhs.dseq {return false}
    if lhs.gseq != rhs.gseq {return false}
    if lhs.oseq != rhs.oseq {return false}
    if lhs.provider != rhs.provider {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Market_V1beta3_Bid: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Bid"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "bid_id"),
    2: .same(proto: "state"),
    3: .same(proto: "price"),
    4: .standard(proto: "created_at"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._bidID) }()
      case 2: try { try decoder.decodeSingularEnumField(value: &self.state) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._price) }()
      case 4: try { try decoder.decodeSingularInt64Field(value: &self.createdAt) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._bidID {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if self.state != .invalid {
      try visitor.visitSingularEnumField(value: self.state, fieldNumber: 2)
    }
    try { if let v = self._price {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if self.createdAt != 0 {
      try visitor.visitSingularInt64Field(value: self.createdAt, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Market_V1beta3_Bid, rhs: Akash_Market_V1beta3_Bid) -> Bool {
    if lhs._bidID != rhs._bidID {return false}
    if lhs.state != rhs.state {return false}
    if lhs._price != rhs._price {return false}
    if lhs.createdAt != rhs.createdAt {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Market_V1beta3_Bid.State: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "invalid"),
    1: .same(proto: "open"),
    2: .same(proto: "active"),
    3: .same(proto: "lost"),
    4: .same(proto: "closed"),
  ]
}

extension Akash_Market_V1beta3_BidFilters: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BidFilters"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .same(proto: "dseq"),
    3: .same(proto: "gseq"),
    4: .same(proto: "oseq"),
    5: .same(proto: "provider"),
    6: .same(proto: "state"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.dseq) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.gseq) }()
      case 4: try { try decoder.decodeSingularUInt32Field(value: &self.oseq) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.provider) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.state) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 1)
    }
    if self.dseq != 0 {
      try visitor.visitSingularUInt64Field(value: self.dseq, fieldNumber: 2)
    }
    if self.gseq != 0 {
      try visitor.visitSingularUInt32Field(value: self.gseq, fieldNumber: 3)
    }
    if self.oseq != 0 {
      try visitor.visitSingularUInt32Field(value: self.oseq, fieldNumber: 4)
    }
    if !self.provider.isEmpty {
      try visitor.visitSingularStringField(value: self.provider, fieldNumber: 5)
    }
    if !self.state.isEmpty {
      try visitor.visitSingularStringField(value: self.state, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Market_V1beta3_BidFilters, rhs: Akash_Market_V1beta3_BidFilters) -> Bool {
    if lhs.owner != rhs.owner {return false}
    if lhs.dseq != rhs.dseq {return false}
    if lhs.gseq != rhs.gseq {return false}
    if lhs.oseq != rhs.oseq {return false}
    if lhs.provider != rhs.provider {return false}
    if lhs.state != rhs.state {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
