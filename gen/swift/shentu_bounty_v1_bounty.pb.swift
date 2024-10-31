// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: shentu/bounty/v1/bounty.proto
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

enum Shentu_Bounty_V1_ProgramStatus: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case inactive // = 0
  case active // = 1
  case closed // = 2
  case UNRECOGNIZED(Int)

  init() {
    self = .inactive
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .inactive
    case 1: self = .active
    case 2: self = .closed
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .inactive: return 0
    case .active: return 1
    case .closed: return 2
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Shentu_Bounty_V1_ProgramStatus: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Shentu_Bounty_V1_ProgramStatus] = [
    .inactive,
    .active,
    .closed,
  ]
}

#endif  // swift(>=4.2)

enum Shentu_Bounty_V1_SeverityLevel: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case unspecified // = 0
  case critical // = 1
  case high // = 2
  case medium // = 3
  case low // = 4
  case informational // = 5
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .critical
    case 2: self = .high
    case 3: self = .medium
    case 4: self = .low
    case 5: self = .informational
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .critical: return 1
    case .high: return 2
    case .medium: return 3
    case .low: return 4
    case .informational: return 5
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Shentu_Bounty_V1_SeverityLevel: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Shentu_Bounty_V1_SeverityLevel] = [
    .unspecified,
    .critical,
    .high,
    .medium,
    .low,
    .informational,
  ]
}

#endif  // swift(>=4.2)

enum Shentu_Bounty_V1_FindingStatus: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case submitted // = 0
  case active // = 1
  case confirmed // = 2
  case paid // = 3
  case closed // = 4
  case UNRECOGNIZED(Int)

  init() {
    self = .submitted
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .submitted
    case 1: self = .active
    case 2: self = .confirmed
    case 3: self = .paid
    case 4: self = .closed
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .submitted: return 0
    case .active: return 1
    case .confirmed: return 2
    case .paid: return 3
    case .closed: return 4
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Shentu_Bounty_V1_FindingStatus: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Shentu_Bounty_V1_FindingStatus] = [
    .submitted,
    .active,
    .confirmed,
    .paid,
    .closed,
  ]
}

#endif  // swift(>=4.2)

struct Shentu_Bounty_V1_Program {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var programID: String = String()

  var name: String = String()

  /// JSON by ProgramDetail
  var detail: String = String()

  var adminAddress: String = String()

  var status: Shentu_Bounty_V1_ProgramStatus = .inactive

  var createTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _createTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_createTime = newValue}
  }
  /// Returns true if `createTime` has been explicitly set.
  var hasCreateTime: Bool {return self._createTime != nil}
  /// Clears the value of `createTime`. Subsequent reads from it will return its default value.
  mutating func clearCreateTime() {self._createTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _createTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct Shentu_Bounty_V1_Finding {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var programID: String = String()

  var findingID: String = String()

  var title: String = String()

  var description_p: String = String()

  var proofOfConcept: String = String()

  /// hash(description + proof_of_concept + submitter)
  var findingHash: String = String()

  var submitterAddress: String = String()

  var severityLevel: Shentu_Bounty_V1_SeverityLevel = .unspecified

  var status: Shentu_Bounty_V1_FindingStatus = .submitted

  /// JSON by FindingDetail
  var detail: String = String()

  var paymentHash: String = String()

  var createTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _createTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_createTime = newValue}
  }
  /// Returns true if `createTime` has been explicitly set.
  var hasCreateTime: Bool {return self._createTime != nil}
  /// Clears the value of `createTime`. Subsequent reads from it will return its default value.
  mutating func clearCreateTime() {self._createTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _createTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct Shentu_Bounty_V1_ProgramFingerprint {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var programID: String = String()

  var name: String = String()

  /// JSON by ProgramDetail
  var detail: String = String()

  var adminAddress: String = String()

  var status: Shentu_Bounty_V1_ProgramStatus = .inactive

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Bounty_V1_FindingFingerprint {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var programID: String = String()

  var findingID: String = String()

  var title: String = String()

  /// hash(description + proof_of_concept + submitter)
  var findingHash: String = String()

  var severityLevel: Shentu_Bounty_V1_SeverityLevel = .unspecified

  var status: Shentu_Bounty_V1_FindingStatus = .submitted

  /// JSON by FindingDetail
  var detail: String = String()

  var paymentHash: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Shentu_Bounty_V1_ProgramStatus: @unchecked Sendable {}
extension Shentu_Bounty_V1_SeverityLevel: @unchecked Sendable {}
extension Shentu_Bounty_V1_FindingStatus: @unchecked Sendable {}
extension Shentu_Bounty_V1_Program: @unchecked Sendable {}
extension Shentu_Bounty_V1_Finding: @unchecked Sendable {}
extension Shentu_Bounty_V1_ProgramFingerprint: @unchecked Sendable {}
extension Shentu_Bounty_V1_FindingFingerprint: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "shentu.bounty.v1"

extension Shentu_Bounty_V1_ProgramStatus: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "PROGRAM_STATUS_INACTIVE"),
    1: .same(proto: "PROGRAM_STATUS_ACTIVE"),
    2: .same(proto: "PROGRAM_STATUS_CLOSED"),
  ]
}

extension Shentu_Bounty_V1_SeverityLevel: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "SEVERITY_LEVEL_UNSPECIFIED"),
    1: .same(proto: "SEVERITY_LEVEL_CRITICAL"),
    2: .same(proto: "SEVERITY_LEVEL_HIGH"),
    3: .same(proto: "SEVERITY_LEVEL_MEDIUM"),
    4: .same(proto: "SEVERITY_LEVEL_LOW"),
    5: .same(proto: "SEVERITY_LEVEL_INFORMATIONAL"),
  ]
}

extension Shentu_Bounty_V1_FindingStatus: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "FINDING_STATUS_SUBMITTED"),
    1: .same(proto: "FINDING_STATUS_ACTIVE"),
    2: .same(proto: "FINDING_STATUS_CONFIRMED"),
    3: .same(proto: "FINDING_STATUS_PAID"),
    4: .same(proto: "FINDING_STATUS_CLOSED"),
  ]
}

extension Shentu_Bounty_V1_Program: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Program"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "program_id"),
    2: .same(proto: "name"),
    3: .same(proto: "detail"),
    4: .standard(proto: "admin_address"),
    5: .same(proto: "status"),
    6: .standard(proto: "create_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.programID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.detail) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.adminAddress) }()
      case 5: try { try decoder.decodeSingularEnumField(value: &self.status) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._createTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.programID.isEmpty {
      try visitor.visitSingularStringField(value: self.programID, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if !self.detail.isEmpty {
      try visitor.visitSingularStringField(value: self.detail, fieldNumber: 3)
    }
    if !self.adminAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.adminAddress, fieldNumber: 4)
    }
    if self.status != .inactive {
      try visitor.visitSingularEnumField(value: self.status, fieldNumber: 5)
    }
    try { if let v = self._createTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Bounty_V1_Program, rhs: Shentu_Bounty_V1_Program) -> Bool {
    if lhs.programID != rhs.programID {return false}
    if lhs.name != rhs.name {return false}
    if lhs.detail != rhs.detail {return false}
    if lhs.adminAddress != rhs.adminAddress {return false}
    if lhs.status != rhs.status {return false}
    if lhs._createTime != rhs._createTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Bounty_V1_Finding: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Finding"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "program_id"),
    2: .standard(proto: "finding_id"),
    3: .same(proto: "title"),
    4: .same(proto: "description"),
    5: .standard(proto: "proof_of_concept"),
    6: .standard(proto: "finding_hash"),
    7: .standard(proto: "submitter_address"),
    8: .standard(proto: "severity_level"),
    9: .same(proto: "status"),
    10: .same(proto: "detail"),
    11: .standard(proto: "payment_hash"),
    12: .standard(proto: "create_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.programID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.findingID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.proofOfConcept) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.findingHash) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.submitterAddress) }()
      case 8: try { try decoder.decodeSingularEnumField(value: &self.severityLevel) }()
      case 9: try { try decoder.decodeSingularEnumField(value: &self.status) }()
      case 10: try { try decoder.decodeSingularStringField(value: &self.detail) }()
      case 11: try { try decoder.decodeSingularStringField(value: &self.paymentHash) }()
      case 12: try { try decoder.decodeSingularMessageField(value: &self._createTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.programID.isEmpty {
      try visitor.visitSingularStringField(value: self.programID, fieldNumber: 1)
    }
    if !self.findingID.isEmpty {
      try visitor.visitSingularStringField(value: self.findingID, fieldNumber: 2)
    }
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 3)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 4)
    }
    if !self.proofOfConcept.isEmpty {
      try visitor.visitSingularStringField(value: self.proofOfConcept, fieldNumber: 5)
    }
    if !self.findingHash.isEmpty {
      try visitor.visitSingularStringField(value: self.findingHash, fieldNumber: 6)
    }
    if !self.submitterAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.submitterAddress, fieldNumber: 7)
    }
    if self.severityLevel != .unspecified {
      try visitor.visitSingularEnumField(value: self.severityLevel, fieldNumber: 8)
    }
    if self.status != .submitted {
      try visitor.visitSingularEnumField(value: self.status, fieldNumber: 9)
    }
    if !self.detail.isEmpty {
      try visitor.visitSingularStringField(value: self.detail, fieldNumber: 10)
    }
    if !self.paymentHash.isEmpty {
      try visitor.visitSingularStringField(value: self.paymentHash, fieldNumber: 11)
    }
    try { if let v = self._createTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 12)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Bounty_V1_Finding, rhs: Shentu_Bounty_V1_Finding) -> Bool {
    if lhs.programID != rhs.programID {return false}
    if lhs.findingID != rhs.findingID {return false}
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.proofOfConcept != rhs.proofOfConcept {return false}
    if lhs.findingHash != rhs.findingHash {return false}
    if lhs.submitterAddress != rhs.submitterAddress {return false}
    if lhs.severityLevel != rhs.severityLevel {return false}
    if lhs.status != rhs.status {return false}
    if lhs.detail != rhs.detail {return false}
    if lhs.paymentHash != rhs.paymentHash {return false}
    if lhs._createTime != rhs._createTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Bounty_V1_ProgramFingerprint: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ProgramFingerprint"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "program_id"),
    2: .same(proto: "name"),
    3: .same(proto: "detail"),
    4: .standard(proto: "admin_address"),
    5: .same(proto: "status"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.programID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.detail) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.adminAddress) }()
      case 5: try { try decoder.decodeSingularEnumField(value: &self.status) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.programID.isEmpty {
      try visitor.visitSingularStringField(value: self.programID, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if !self.detail.isEmpty {
      try visitor.visitSingularStringField(value: self.detail, fieldNumber: 3)
    }
    if !self.adminAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.adminAddress, fieldNumber: 4)
    }
    if self.status != .inactive {
      try visitor.visitSingularEnumField(value: self.status, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Bounty_V1_ProgramFingerprint, rhs: Shentu_Bounty_V1_ProgramFingerprint) -> Bool {
    if lhs.programID != rhs.programID {return false}
    if lhs.name != rhs.name {return false}
    if lhs.detail != rhs.detail {return false}
    if lhs.adminAddress != rhs.adminAddress {return false}
    if lhs.status != rhs.status {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Bounty_V1_FindingFingerprint: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FindingFingerprint"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "program_id"),
    2: .standard(proto: "finding_id"),
    3: .same(proto: "title"),
    4: .standard(proto: "finding_hash"),
    5: .standard(proto: "severity_level"),
    6: .same(proto: "status"),
    7: .same(proto: "detail"),
    8: .standard(proto: "payment_hash"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.programID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.findingID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.findingHash) }()
      case 5: try { try decoder.decodeSingularEnumField(value: &self.severityLevel) }()
      case 6: try { try decoder.decodeSingularEnumField(value: &self.status) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.detail) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.paymentHash) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.programID.isEmpty {
      try visitor.visitSingularStringField(value: self.programID, fieldNumber: 1)
    }
    if !self.findingID.isEmpty {
      try visitor.visitSingularStringField(value: self.findingID, fieldNumber: 2)
    }
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 3)
    }
    if !self.findingHash.isEmpty {
      try visitor.visitSingularStringField(value: self.findingHash, fieldNumber: 4)
    }
    if self.severityLevel != .unspecified {
      try visitor.visitSingularEnumField(value: self.severityLevel, fieldNumber: 5)
    }
    if self.status != .submitted {
      try visitor.visitSingularEnumField(value: self.status, fieldNumber: 6)
    }
    if !self.detail.isEmpty {
      try visitor.visitSingularStringField(value: self.detail, fieldNumber: 7)
    }
    if !self.paymentHash.isEmpty {
      try visitor.visitSingularStringField(value: self.paymentHash, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Bounty_V1_FindingFingerprint, rhs: Shentu_Bounty_V1_FindingFingerprint) -> Bool {
    if lhs.programID != rhs.programID {return false}
    if lhs.findingID != rhs.findingID {return false}
    if lhs.title != rhs.title {return false}
    if lhs.findingHash != rhs.findingHash {return false}
    if lhs.severityLevel != rhs.severityLevel {return false}
    if lhs.status != rhs.status {return false}
    if lhs.detail != rhs.detail {return false}
    if lhs.paymentHash != rhs.paymentHash {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}