// source: quicksilver/airdrop/v1/proposals.proto
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

goog.provide('proto.quicksilver.airdrop.v1.RegisterZoneDropProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.quicksilver.airdrop.v1.ZoneDrop');

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
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.quicksilver.airdrop.v1.RegisterZoneDropProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.displayName = 'proto.quicksilver.airdrop.v1.RegisterZoneDropProposal';
}



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
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quicksilver.airdrop.v1.RegisterZoneDropProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    zoneDrop: (f = msg.getZoneDrop()) && proto.quicksilver.airdrop.v1.ZoneDrop.toObject(includeInstance, f),
    claimRecords: msg.getClaimRecords_asB64()
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
 * @return {!proto.quicksilver.airdrop.v1.RegisterZoneDropProposal}
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quicksilver.airdrop.v1.RegisterZoneDropProposal;
  return proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quicksilver.airdrop.v1.RegisterZoneDropProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quicksilver.airdrop.v1.RegisterZoneDropProposal}
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = new proto.quicksilver.airdrop.v1.ZoneDrop;
      reader.readMessage(value,proto.quicksilver.airdrop.v1.ZoneDrop.deserializeBinaryFromReader);
      msg.setZoneDrop(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setClaimRecords(value);
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
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quicksilver.airdrop.v1.RegisterZoneDropProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getZoneDrop();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.quicksilver.airdrop.v1.ZoneDrop.serializeBinaryToWriter
    );
  }
  f = message.getClaimRecords_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.airdrop.v1.RegisterZoneDropProposal} returns this
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.airdrop.v1.RegisterZoneDropProposal} returns this
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional ZoneDrop zone_drop = 3;
 * @return {?proto.quicksilver.airdrop.v1.ZoneDrop}
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.getZoneDrop = function() {
  return /** @type{?proto.quicksilver.airdrop.v1.ZoneDrop} */ (
    jspb.Message.getWrapperField(this, proto.quicksilver.airdrop.v1.ZoneDrop, 3));
};


/**
 * @param {?proto.quicksilver.airdrop.v1.ZoneDrop|undefined} value
 * @return {!proto.quicksilver.airdrop.v1.RegisterZoneDropProposal} returns this
*/
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.setZoneDrop = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quicksilver.airdrop.v1.RegisterZoneDropProposal} returns this
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.clearZoneDrop = function() {
  return this.setZoneDrop(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.hasZoneDrop = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional bytes claim_records = 4;
 * @return {string}
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.getClaimRecords = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes claim_records = 4;
 * This is a type-conversion wrapper around `getClaimRecords()`
 * @return {string}
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.getClaimRecords_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getClaimRecords()));
};


/**
 * optional bytes claim_records = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getClaimRecords()`
 * @return {!Uint8Array}
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.getClaimRecords_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getClaimRecords()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.quicksilver.airdrop.v1.RegisterZoneDropProposal} returns this
 */
proto.quicksilver.airdrop.v1.RegisterZoneDropProposal.prototype.setClaimRecords = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


