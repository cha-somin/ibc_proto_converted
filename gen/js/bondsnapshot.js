// source: stafihub/ledger/ledger.proto
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

goog.provide('proto.stafihub.stafihub.ledger.BondSnapshot');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.ledger.LinkChunk');

goog.forwardDeclare('proto.stafihub.stafihub.ledger.PoolBondState');
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
proto.stafihub.stafihub.ledger.BondSnapshot = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stafihub.stafihub.ledger.BondSnapshot, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.ledger.BondSnapshot.displayName = 'proto.stafihub.stafihub.ledger.BondSnapshot';
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
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.ledger.BondSnapshot.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.ledger.BondSnapshot} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.ledger.BondSnapshot.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    pool: jspb.Message.getFieldWithDefault(msg, 2, ""),
    era: jspb.Message.getFieldWithDefault(msg, 3, 0),
    chunk: (f = msg.getChunk()) && proto.stafihub.stafihub.ledger.LinkChunk.toObject(includeInstance, f),
    bondState: jspb.Message.getFieldWithDefault(msg, 6, 0)
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
 * @return {!proto.stafihub.stafihub.ledger.BondSnapshot}
 */
proto.stafihub.stafihub.ledger.BondSnapshot.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.ledger.BondSnapshot;
  return proto.stafihub.stafihub.ledger.BondSnapshot.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.ledger.BondSnapshot} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.ledger.BondSnapshot}
 */
proto.stafihub.stafihub.ledger.BondSnapshot.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setPool(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setEra(value);
      break;
    case 4:
      var value = new proto.stafihub.stafihub.ledger.LinkChunk;
      reader.readMessage(value,proto.stafihub.stafihub.ledger.LinkChunk.deserializeBinaryFromReader);
      msg.setChunk(value);
      break;
    case 6:
      var value = /** @type {!proto.stafihub.stafihub.ledger.PoolBondState} */ (reader.readEnum());
      msg.setBondState(value);
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
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.ledger.BondSnapshot.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.ledger.BondSnapshot} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.ledger.BondSnapshot.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPool();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getEra();
  if (f !== 0) {
    writer.writeUint32(
      3,
      f
    );
  }
  f = message.getChunk();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.stafihub.stafihub.ledger.LinkChunk.serializeBinaryToWriter
    );
  }
  f = message.getBondState();
  if (f !== 0.0) {
    writer.writeEnum(
      6,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.ledger.BondSnapshot} returns this
 */
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string pool = 2;
 * @return {string}
 */
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.getPool = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.ledger.BondSnapshot} returns this
 */
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.setPool = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint32 era = 3;
 * @return {number}
 */
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.getEra = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.stafihub.stafihub.ledger.BondSnapshot} returns this
 */
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.setEra = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional LinkChunk chunk = 4;
 * @return {?proto.stafihub.stafihub.ledger.LinkChunk}
 */
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.getChunk = function() {
  return /** @type{?proto.stafihub.stafihub.ledger.LinkChunk} */ (
    jspb.Message.getWrapperField(this, proto.stafihub.stafihub.ledger.LinkChunk, 4));
};


/**
 * @param {?proto.stafihub.stafihub.ledger.LinkChunk|undefined} value
 * @return {!proto.stafihub.stafihub.ledger.BondSnapshot} returns this
*/
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.setChunk = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stafihub.stafihub.ledger.BondSnapshot} returns this
 */
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.clearChunk = function() {
  return this.setChunk(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.hasChunk = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional PoolBondState bond_state = 6;
 * @return {!proto.stafihub.stafihub.ledger.PoolBondState}
 */
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.getBondState = function() {
  return /** @type {!proto.stafihub.stafihub.ledger.PoolBondState} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {!proto.stafihub.stafihub.ledger.PoolBondState} value
 * @return {!proto.stafihub.stafihub.ledger.BondSnapshot} returns this
 */
proto.stafihub.stafihub.ledger.BondSnapshot.prototype.setBondState = function(value) {
  return jspb.Message.setProto3EnumField(this, 6, value);
};


