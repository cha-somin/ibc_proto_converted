// source: provenance/metadata/v1/specification.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.provenance.metadata.v1.ContractSpecification');
goog.provide('proto.provenance.metadata.v1.ContractSpecification.SourceCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.metadata.v1.Description');

goog.forwardDeclare('proto.provenance.metadata.v1.PartyType');
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.provenance.metadata.v1.ContractSpecification = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.ContractSpecification.repeatedFields_, proto.provenance.metadata.v1.ContractSpecification.oneofGroups_);
};
goog.inherits(proto.provenance.metadata.v1.ContractSpecification, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.ContractSpecification.displayName = 'proto.provenance.metadata.v1.ContractSpecification';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.ContractSpecification.repeatedFields_ = [3,4];

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.provenance.metadata.v1.ContractSpecification.oneofGroups_ = [[5,6]];

/**
 * @enum {number}
 */
proto.provenance.metadata.v1.ContractSpecification.SourceCase = {
  SOURCE_NOT_SET: 0,
  RESOURCE_ID: 5,
  HASH: 6
};

/**
 * @return {proto.provenance.metadata.v1.ContractSpecification.SourceCase}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.getSourceCase = function() {
  return /** @type {proto.provenance.metadata.v1.ContractSpecification.SourceCase} */(jspb.Message.computeOneofCase(this, proto.provenance.metadata.v1.ContractSpecification.oneofGroups_[0]));
};



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.ContractSpecification.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.ContractSpecification} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.ContractSpecification.toObject = function(includeInstance, msg) {
  var f, obj = {
    specificationId: msg.getSpecificationId_asB64(),
    description: (f = msg.getDescription()) && proto.provenance.metadata.v1.Description.toObject(includeInstance, f),
    ownerAddressesList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    partiesInvolvedList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f,
    resourceId: msg.getResourceId_asB64(),
    hash: jspb.Message.getFieldWithDefault(msg, 6, ""),
    className: jspb.Message.getFieldWithDefault(msg, 7, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.provenance.metadata.v1.ContractSpecification}
 */
proto.provenance.metadata.v1.ContractSpecification.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.ContractSpecification;
  return proto.provenance.metadata.v1.ContractSpecification.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.ContractSpecification} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.ContractSpecification}
 */
proto.provenance.metadata.v1.ContractSpecification.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSpecificationId(value);
      break;
    case 2:
      var value = new proto.provenance.metadata.v1.Description;
      reader.readMessage(value,proto.provenance.metadata.v1.Description.deserializeBinaryFromReader);
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addOwnerAddresses(value);
      break;
    case 4:
      var values = /** @type {!Array<!proto.provenance.metadata.v1.PartyType>} */ (reader.isDelimited() ? reader.readPackedEnum() : [reader.readEnum()]);
      for (var i = 0; i < values.length; i++) {
        msg.addPartiesInvolved(values[i]);
      }
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setResourceId(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setHash(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setClassName(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.ContractSpecification.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.ContractSpecification} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.ContractSpecification.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSpecificationId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.provenance.metadata.v1.Description.serializeBinaryToWriter
    );
  }
  f = message.getOwnerAddressesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
  f = message.getPartiesInvolvedList();
  if (f.length > 0) {
    writer.writePackedEnum(
      4,
      f
    );
  }
  f = /** @type {!(string|Uint8Array)} */ (jspb.Message.getField(message, 5));
  if (f != null) {
    writer.writeBytes(
      5,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 6));
  if (f != null) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getClassName();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
};


/**
 * optional bytes specification_id = 1;
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.getSpecificationId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes specification_id = 1;
 * This is a type-conversion wrapper around `getSpecificationId()`
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.getSpecificationId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSpecificationId()));
};


/**
 * optional bytes specification_id = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSpecificationId()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.getSpecificationId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSpecificationId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.setSpecificationId = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional Description description = 2;
 * @return {?proto.provenance.metadata.v1.Description}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.getDescription = function() {
  return /** @type{?proto.provenance.metadata.v1.Description} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.Description, 2));
};


/**
 * @param {?proto.provenance.metadata.v1.Description|undefined} value
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
*/
proto.provenance.metadata.v1.ContractSpecification.prototype.setDescription = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.clearDescription = function() {
  return this.setDescription(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.hasDescription = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated string owner_addresses = 3;
 * @return {!Array<string>}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.getOwnerAddressesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.setOwnerAddressesList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.addOwnerAddresses = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.clearOwnerAddressesList = function() {
  return this.setOwnerAddressesList([]);
};


/**
 * repeated PartyType parties_involved = 4;
 * @return {!Array<!proto.provenance.metadata.v1.PartyType>}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.getPartiesInvolvedList = function() {
  return /** @type {!Array<!proto.provenance.metadata.v1.PartyType>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.PartyType>} value
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.setPartiesInvolvedList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {!proto.provenance.metadata.v1.PartyType} value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.addPartiesInvolved = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.clearPartiesInvolvedList = function() {
  return this.setPartiesInvolvedList([]);
};


/**
 * optional bytes resource_id = 5;
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.getResourceId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes resource_id = 5;
 * This is a type-conversion wrapper around `getResourceId()`
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.getResourceId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getResourceId()));
};


/**
 * optional bytes resource_id = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getResourceId()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.getResourceId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getResourceId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.setResourceId = function(value) {
  return jspb.Message.setOneofField(this, 5, proto.provenance.metadata.v1.ContractSpecification.oneofGroups_[0], value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.clearResourceId = function() {
  return jspb.Message.setOneofField(this, 5, proto.provenance.metadata.v1.ContractSpecification.oneofGroups_[0], undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.hasResourceId = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional string hash = 6;
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.getHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.setHash = function(value) {
  return jspb.Message.setOneofField(this, 6, proto.provenance.metadata.v1.ContractSpecification.oneofGroups_[0], value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.clearHash = function() {
  return jspb.Message.setOneofField(this, 6, proto.provenance.metadata.v1.ContractSpecification.oneofGroups_[0], undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.hasHash = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional string class_name = 7;
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.getClassName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.ContractSpecification} returns this
 */
proto.provenance.metadata.v1.ContractSpecification.prototype.setClassName = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


