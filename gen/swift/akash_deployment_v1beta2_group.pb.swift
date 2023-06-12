// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: akash/deployment/v1beta2/group.proto
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

/// Group stores group id, state and specifications of group
struct Akash_Deployment_V1beta2_Group {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var groupID: Akash_Deployment_V1beta2_GroupID {
    get {return _groupID ?? Akash_Deployment_V1beta2_GroupID()}
    set {_groupID = newValue}
  }
  /// Returns true if `groupID` has been explicitly set.
  var hasGroupID: Bool {return self._groupID != nil}
  /// Clears the value of `groupID`. Subsequent reads from it will return its default value.
  mutating func clearGroupID() {self._groupID = nil}

  var state: Akash_Deployment_V1beta2_Group.State = .invalid

  var groupSpec: Akash_Deployment_V1beta2_GroupSpec {
    get {return _groupSpec ?? Akash_Deployment_V1beta2_GroupSpec()}
    set {_groupSpec = newValue}
  }
  /// Returns true if `groupSpec` has been explicitly set.
  var hasGroupSpec: Bool {return self._groupSpec != nil}
  /// Clears the value of `groupSpec`. Subsequent reads from it will return its default value.
  mutating func clearGroupSpec() {self._groupSpec = nil}

  var createdAt: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  /// State is an enum which refers to state of group
  enum State: SwiftProtobuf.Enum {
    typealias RawValue = Int

    /// Prefix should start with 0 in enum. So declaring dummy state
    case invalid // = 0

    /// GroupOpen denotes state for group open
    case `open` // = 1

    /// GroupOrdered denotes state for group ordered
    case paused // = 2

    /// GroupInsufficientFunds denotes state for group insufficient_funds
    case insufficientFunds // = 3

    /// GroupClosed denotes state for group closed
    case closed // = 4
    case UNRECOGNIZED(Int)

    init() {
      self = .invalid
    }

    init?(rawValue: Int) {
      switch rawValue {
      case 0: self = .invalid
      case 1: self = .open
      case 2: self = .paused
      case 3: self = .insufficientFunds
      case 4: self = .closed
      default: self = .UNRECOGNIZED(rawValue)
      }
    }

    var rawValue: Int {
      switch self {
      case .invalid: return 0
      case .open: return 1
      case .paused: return 2
      case .insufficientFunds: return 3
      case .closed: return 4
      case .UNRECOGNIZED(let i): return i
      }
    }

  }

  init() {}

  fileprivate var _groupID: Akash_Deployment_V1beta2_GroupID? = nil
  fileprivate var _groupSpec: Akash_Deployment_V1beta2_GroupSpec? = nil
}

#if swift(>=4.2)

extension Akash_Deployment_V1beta2_Group.State: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Akash_Deployment_V1beta2_Group.State] = [
    .invalid,
    .open,
    .paused,
    .insufficientFunds,
    .closed,
  ]
}

#endif  // swift(>=4.2)

#if swift(>=5.5) && canImport(_Concurrency)
extension Akash_Deployment_V1beta2_Group: @unchecked Sendable {}
extension Akash_Deployment_V1beta2_Group.State: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "akash.deployment.v1beta2"

extension Akash_Deployment_V1beta2_Group: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Group"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "group_id"),
    2: .same(proto: "state"),
    3: .standard(proto: "group_spec"),
    4: .standard(proto: "created_at"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._groupID) }()
      case 2: try { try decoder.decodeSingularEnumField(value: &self.state) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._groupSpec) }()
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
    try { if let v = self._groupID {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if self.state != .invalid {
      try visitor.visitSingularEnumField(value: self.state, fieldNumber: 2)
    }
    try { if let v = self._groupSpec {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if self.createdAt != 0 {
      try visitor.visitSingularInt64Field(value: self.createdAt, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Deployment_V1beta2_Group, rhs: Akash_Deployment_V1beta2_Group) -> Bool {
    if lhs._groupID != rhs._groupID {return false}
    if lhs.state != rhs.state {return false}
    if lhs._groupSpec != rhs._groupSpec {return false}
    if lhs.createdAt != rhs.createdAt {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Deployment_V1beta2_Group.State: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "invalid"),
    1: .same(proto: "open"),
    2: .same(proto: "paused"),
    3: .same(proto: "insufficient_funds"),
    4: .same(proto: "closed"),
  ]
}
