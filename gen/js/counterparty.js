// source: ibc/core/connection/v1/connection.proto
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

goog.provide('proto.ibc.core.connection.v1.Counterparty');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ibc.core.commitment.v1.MerklePrefix');

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
proto.ibc.core.connection.v1.Counterparty = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.core.connection.v1.Counterparty, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.core.connection.v1.Counterparty.displayName = 'proto.ibc.core.connection.v1.Counterparty';
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
proto.ibc.core.connection.v1.Counterparty.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.core.connection.v1.Counterparty.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.core.connection.v1.Counterparty} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.connection.v1.Counterparty.toObject = function(includeInstance, msg) {
  var f, obj = {
    clientId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    connectionId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    prefix: (f = msg.getPrefix()) && proto.ibc.core.commitment.v1.MerklePrefix.toObject(includeInstance, f)
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
 * @return {!proto.ibc.core.connection.v1.Counterparty}
 */
proto.ibc.core.connection.v1.Counterparty.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.core.connection.v1.Counterparty;
  return proto.ibc.core.connection.v1.Counterparty.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.core.connection.v1.Counterparty} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.core.connection.v1.Counterparty}
 */
proto.ibc.core.connection.v1.Counterparty.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setClientId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setConnectionId(value);
      break;
    case 3:
      var value = new proto.ibc.core.commitment.v1.MerklePrefix;
      reader.readMessage(value,proto.ibc.core.commitment.v1.MerklePrefix.deserializeBinaryFromReader);
      msg.setPrefix(value);
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
proto.ibc.core.connection.v1.Counterparty.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.core.connection.v1.Counterparty.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.core.connection.v1.Counterparty} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.connection.v1.Counterparty.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClientId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getConnectionId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getPrefix();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.ibc.core.commitment.v1.MerklePrefix.serializeBinaryToWriter
    );
  }
};


/**
 * optional string client_id = 1;
 * @return {string}
 */
proto.ibc.core.connection.v1.Counterparty.prototype.getClientId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.connection.v1.Counterparty} returns this
 */
proto.ibc.core.connection.v1.Counterparty.prototype.setClientId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string connection_id = 2;
 * @return {string}
 */
proto.ibc.core.connection.v1.Counterparty.prototype.getConnectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.connection.v1.Counterparty} returns this
 */
proto.ibc.core.connection.v1.Counterparty.prototype.setConnectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional ibc.core.commitment.v1.MerklePrefix prefix = 3;
 * @return {?proto.ibc.core.commitment.v1.MerklePrefix}
 */
proto.ibc.core.connection.v1.Counterparty.prototype.getPrefix = function() {
  return /** @type{?proto.ibc.core.commitment.v1.MerklePrefix} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.commitment.v1.MerklePrefix, 3));
};


/**
 * @param {?proto.ibc.core.commitment.v1.MerklePrefix|undefined} value
 * @return {!proto.ibc.core.connection.v1.Counterparty} returns this
*/
proto.ibc.core.connection.v1.Counterparty.prototype.setPrefix = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.core.connection.v1.Counterparty} returns this
 */
proto.ibc.core.connection.v1.Counterparty.prototype.clearPrefix = function() {
  return this.setPrefix(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.core.connection.v1.Counterparty.prototype.hasPrefix = function() {
  return jspb.Message.getField(this, 3) != null;
};


