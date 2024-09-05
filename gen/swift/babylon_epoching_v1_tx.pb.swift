// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: babylon/epoching/v1/tx.proto
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

/// MsgWrappedDelegate is the message for delegating stakes
struct Babylon_Epoching_V1_MsgWrappedDelegate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var msg: Cosmos_Staking_V1beta1_MsgDelegate {
    get {return _msg ?? Cosmos_Staking_V1beta1_MsgDelegate()}
    set {_msg = newValue}
  }
  /// Returns true if `msg` has been explicitly set.
  var hasMsg: Bool {return self._msg != nil}
  /// Clears the value of `msg`. Subsequent reads from it will return its default value.
  mutating func clearMsg() {self._msg = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _msg: Cosmos_Staking_V1beta1_MsgDelegate? = nil
}

/// MsgWrappedDelegate is the response to the MsgWrappedDelegate message
struct Babylon_Epoching_V1_MsgWrappedDelegateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgWrappedUndelegate is the message for undelegating stakes
struct Babylon_Epoching_V1_MsgWrappedUndelegate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var msg: Cosmos_Staking_V1beta1_MsgUndelegate {
    get {return _msg ?? Cosmos_Staking_V1beta1_MsgUndelegate()}
    set {_msg = newValue}
  }
  /// Returns true if `msg` has been explicitly set.
  var hasMsg: Bool {return self._msg != nil}
  /// Clears the value of `msg`. Subsequent reads from it will return its default value.
  mutating func clearMsg() {self._msg = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _msg: Cosmos_Staking_V1beta1_MsgUndelegate? = nil
}

/// MsgWrappedUndelegateResponse is the response to the MsgWrappedUndelegate
/// message
struct Babylon_Epoching_V1_MsgWrappedUndelegateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgWrappedDelegate is the message for moving bonded stakes from a
/// validator to another validator
struct Babylon_Epoching_V1_MsgWrappedBeginRedelegate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var msg: Cosmos_Staking_V1beta1_MsgBeginRedelegate {
    get {return _msg ?? Cosmos_Staking_V1beta1_MsgBeginRedelegate()}
    set {_msg = newValue}
  }
  /// Returns true if `msg` has been explicitly set.
  var hasMsg: Bool {return self._msg != nil}
  /// Clears the value of `msg`. Subsequent reads from it will return its default value.
  mutating func clearMsg() {self._msg = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _msg: Cosmos_Staking_V1beta1_MsgBeginRedelegate? = nil
}

/// MsgWrappedBeginRedelegateResponse is the response to the
/// MsgWrappedBeginRedelegate message
struct Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgWrappedCancelUnbondingDelegation is the message for cancelling
/// an unbonding delegation
struct Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var msg: Cosmos_Staking_V1beta1_MsgCancelUnbondingDelegation {
    get {return _msg ?? Cosmos_Staking_V1beta1_MsgCancelUnbondingDelegation()}
    set {_msg = newValue}
  }
  /// Returns true if `msg` has been explicitly set.
  var hasMsg: Bool {return self._msg != nil}
  /// Clears the value of `msg`. Subsequent reads from it will return its default value.
  mutating func clearMsg() {self._msg = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _msg: Cosmos_Staking_V1beta1_MsgCancelUnbondingDelegation? = nil
}

/// MsgWrappedCancelUnbondingDelegationResponse is the response to the
/// MsgWrappedCancelUnbondingDelegation message
struct Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUpdateParams defines a message for updating epoching module parameters.
struct Babylon_Epoching_V1_MsgUpdateParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority is the address of the governance account.
  /// just FYI: cosmos.AddressString marks that this field should use type alias
  /// for AddressString instead of string, but the functionality is not yet implemented
  /// in cosmos-proto
  var authority: String = String()

  /// params defines the epoching parameters to update.
  ///
  /// NOTE: All parameters must be supplied.
  var params: Babylon_Epoching_V1_Params {
    get {return _params ?? Babylon_Epoching_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Babylon_Epoching_V1_Params? = nil
}

/// MsgUpdateParamsResponse is the response to the MsgUpdateParams message.
struct Babylon_Epoching_V1_MsgUpdateParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Babylon_Epoching_V1_MsgWrappedDelegate: @unchecked Sendable {}
extension Babylon_Epoching_V1_MsgWrappedDelegateResponse: @unchecked Sendable {}
extension Babylon_Epoching_V1_MsgWrappedUndelegate: @unchecked Sendable {}
extension Babylon_Epoching_V1_MsgWrappedUndelegateResponse: @unchecked Sendable {}
extension Babylon_Epoching_V1_MsgWrappedBeginRedelegate: @unchecked Sendable {}
extension Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse: @unchecked Sendable {}
extension Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation: @unchecked Sendable {}
extension Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse: @unchecked Sendable {}
extension Babylon_Epoching_V1_MsgUpdateParams: @unchecked Sendable {}
extension Babylon_Epoching_V1_MsgUpdateParamsResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "babylon.epoching.v1"

extension Babylon_Epoching_V1_MsgWrappedDelegate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgWrappedDelegate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "msg"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._msg) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._msg {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Epoching_V1_MsgWrappedDelegate, rhs: Babylon_Epoching_V1_MsgWrappedDelegate) -> Bool {
    if lhs._msg != rhs._msg {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Epoching_V1_MsgWrappedDelegateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgWrappedDelegateResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Epoching_V1_MsgWrappedDelegateResponse, rhs: Babylon_Epoching_V1_MsgWrappedDelegateResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Epoching_V1_MsgWrappedUndelegate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgWrappedUndelegate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "msg"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._msg) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._msg {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Epoching_V1_MsgWrappedUndelegate, rhs: Babylon_Epoching_V1_MsgWrappedUndelegate) -> Bool {
    if lhs._msg != rhs._msg {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Epoching_V1_MsgWrappedUndelegateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgWrappedUndelegateResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Epoching_V1_MsgWrappedUndelegateResponse, rhs: Babylon_Epoching_V1_MsgWrappedUndelegateResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Epoching_V1_MsgWrappedBeginRedelegate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgWrappedBeginRedelegate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "msg"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._msg) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._msg {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Epoching_V1_MsgWrappedBeginRedelegate, rhs: Babylon_Epoching_V1_MsgWrappedBeginRedelegate) -> Bool {
    if lhs._msg != rhs._msg {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgWrappedBeginRedelegateResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse, rhs: Babylon_Epoching_V1_MsgWrappedBeginRedelegateResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgWrappedCancelUnbondingDelegation"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "msg"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._msg) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._msg {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation, rhs: Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegation) -> Bool {
    if lhs._msg != rhs._msg {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgWrappedCancelUnbondingDelegationResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse, rhs: Babylon_Epoching_V1_MsgWrappedCancelUnbondingDelegationResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Epoching_V1_MsgUpdateParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Epoching_V1_MsgUpdateParams, rhs: Babylon_Epoching_V1_MsgUpdateParams) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Epoching_V1_MsgUpdateParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParamsResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Epoching_V1_MsgUpdateParamsResponse, rhs: Babylon_Epoching_V1_MsgUpdateParamsResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}