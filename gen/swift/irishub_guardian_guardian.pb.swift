// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: irishub/guardian/guardian.proto
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

/// AccountType defines the super account type
enum Irishub_Guardian_AccountType: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// GENESIS defines a genesis account type
  case genesis // = 0

  /// ORDINARY defines a ordinary account type
  case ordinary // = 1
  case UNRECOGNIZED(Int)

  init() {
    self = .genesis
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .genesis
    case 1: self = .ordinary
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .genesis: return 0
    case .ordinary: return 1
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Irishub_Guardian_AccountType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Irishub_Guardian_AccountType] = [
    .genesis,
    .ordinary,
  ]
}

#endif  // swift(>=4.2)

/// Super defines the super standard
struct Irishub_Guardian_Super {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var description_p: String = String()

  var accountType: Irishub_Guardian_AccountType = .genesis

  var address: String = String()

  var addedBy: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Irishub_Guardian_AccountType: @unchecked Sendable {}
extension Irishub_Guardian_Super: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "irishub.guardian"

extension Irishub_Guardian_AccountType: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "GENESIS"),
    1: .same(proto: "ORDINARY"),
  ]
}

extension Irishub_Guardian_Super: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Super"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "description"),
    2: .standard(proto: "account_type"),
    3: .same(proto: "address"),
    4: .standard(proto: "added_by"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 2: try { try decoder.decodeSingularEnumField(value: &self.accountType) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.addedBy) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 1)
    }
    if self.accountType != .genesis {
      try visitor.visitSingularEnumField(value: self.accountType, fieldNumber: 2)
    }
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 3)
    }
    if !self.addedBy.isEmpty {
      try visitor.visitSingularStringField(value: self.addedBy, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irishub_Guardian_Super, rhs: Irishub_Guardian_Super) -> Bool {
    if lhs.description_p != rhs.description_p {return false}
    if lhs.accountType != rhs.accountType {return false}
    if lhs.address != rhs.address {return false}
    if lhs.addedBy != rhs.addedBy {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
