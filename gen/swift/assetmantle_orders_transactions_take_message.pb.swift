// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: assetmantle/orders/transactions/take/message.proto
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

struct Assetmantle_Modules_Orders_Transactions_Take_Message {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var from: String = String()

  var fromID: Assetmantle_Schema_Ids_Base_IdentityID {
    get {return _fromID ?? Assetmantle_Schema_Ids_Base_IdentityID()}
    set {_fromID = newValue}
  }
  /// Returns true if `fromID` has been explicitly set.
  var hasFromID: Bool {return self._fromID != nil}
  /// Clears the value of `fromID`. Subsequent reads from it will return its default value.
  mutating func clearFromID() {self._fromID = nil}

  var takerOwnableSplit: String = String()

  var orderID: Assetmantle_Schema_Ids_Base_OrderID {
    get {return _orderID ?? Assetmantle_Schema_Ids_Base_OrderID()}
    set {_orderID = newValue}
  }
  /// Returns true if `orderID` has been explicitly set.
  var hasOrderID: Bool {return self._orderID != nil}
  /// Clears the value of `orderID`. Subsequent reads from it will return its default value.
  mutating func clearOrderID() {self._orderID = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _fromID: Assetmantle_Schema_Ids_Base_IdentityID? = nil
  fileprivate var _orderID: Assetmantle_Schema_Ids_Base_OrderID? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Assetmantle_Modules_Orders_Transactions_Take_Message: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "assetmantle.modules.orders.transactions.take"

extension Assetmantle_Modules_Orders_Transactions_Take_Message: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Message"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "from"),
    2: .standard(proto: "from_i_d"),
    3: .standard(proto: "taker_ownable_split"),
    4: .standard(proto: "order_i_d"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.from) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._fromID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.takerOwnableSplit) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._orderID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.from.isEmpty {
      try visitor.visitSingularStringField(value: self.from, fieldNumber: 1)
    }
    try { if let v = self._fromID {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.takerOwnableSplit.isEmpty {
      try visitor.visitSingularStringField(value: self.takerOwnableSplit, fieldNumber: 3)
    }
    try { if let v = self._orderID {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Assetmantle_Modules_Orders_Transactions_Take_Message, rhs: Assetmantle_Modules_Orders_Transactions_Take_Message) -> Bool {
    if lhs.from != rhs.from {return false}
    if lhs._fromID != rhs._fromID {return false}
    if lhs.takerOwnableSplit != rhs.takerOwnableSplit {return false}
    if lhs._orderID != rhs._orderID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
