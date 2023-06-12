// source: lum-network/icqueries/genesis.proto
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

goog.provide('proto.lum.network.icqueries.Query');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.lum.network.icqueries.Query = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lum.network.icqueries.Query, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.icqueries.Query.displayName = 'proto.lum.network.icqueries.Query';
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
proto.lum.network.icqueries.Query.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.icqueries.Query.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.icqueries.Query} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.icqueries.Query.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    connectionId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    chainId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    queryType: jspb.Message.getFieldWithDefault(msg, 4, ""),
    request: msg.getRequest_asB64(),
    callbackId: jspb.Message.getFieldWithDefault(msg, 8, ""),
    ttl: jspb.Message.getFieldWithDefault(msg, 9, 0),
    requestSent: jspb.Message.getBooleanFieldWithDefault(msg, 11, false),
    extraId: jspb.Message.getFieldWithDefault(msg, 12, "")
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
 * @return {!proto.lum.network.icqueries.Query}
 */
proto.lum.network.icqueries.Query.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.icqueries.Query;
  return proto.lum.network.icqueries.Query.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.icqueries.Query} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.icqueries.Query}
 */
proto.lum.network.icqueries.Query.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setConnectionId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setChainId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setQueryType(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setRequest(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setCallbackId(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTtl(value);
      break;
    case 11:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setRequestSent(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setExtraId(value);
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
proto.lum.network.icqueries.Query.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.icqueries.Query.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.icqueries.Query} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.icqueries.Query.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
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
  f = message.getChainId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getQueryType();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getRequest_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
  f = message.getCallbackId();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getTtl();
  if (f !== 0) {
    writer.writeUint64(
      9,
      f
    );
  }
  f = message.getRequestSent();
  if (f) {
    writer.writeBool(
      11,
      f
    );
  }
  f = message.getExtraId();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.lum.network.icqueries.Query.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.icqueries.Query} returns this
 */
proto.lum.network.icqueries.Query.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string connection_id = 2;
 * @return {string}
 */
proto.lum.network.icqueries.Query.prototype.getConnectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.icqueries.Query} returns this
 */
proto.lum.network.icqueries.Query.prototype.setConnectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string chain_id = 3;
 * @return {string}
 */
proto.lum.network.icqueries.Query.prototype.getChainId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.icqueries.Query} returns this
 */
proto.lum.network.icqueries.Query.prototype.setChainId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string query_type = 4;
 * @return {string}
 */
proto.lum.network.icqueries.Query.prototype.getQueryType = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.icqueries.Query} returns this
 */
proto.lum.network.icqueries.Query.prototype.setQueryType = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional bytes request = 5;
 * @return {string}
 */
proto.lum.network.icqueries.Query.prototype.getRequest = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes request = 5;
 * This is a type-conversion wrapper around `getRequest()`
 * @return {string}
 */
proto.lum.network.icqueries.Query.prototype.getRequest_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getRequest()));
};


/**
 * optional bytes request = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getRequest()`
 * @return {!Uint8Array}
 */
proto.lum.network.icqueries.Query.prototype.getRequest_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getRequest()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.lum.network.icqueries.Query} returns this
 */
proto.lum.network.icqueries.Query.prototype.setRequest = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};


/**
 * optional string callback_id = 8;
 * @return {string}
 */
proto.lum.network.icqueries.Query.prototype.getCallbackId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.icqueries.Query} returns this
 */
proto.lum.network.icqueries.Query.prototype.setCallbackId = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional uint64 ttl = 9;
 * @return {number}
 */
proto.lum.network.icqueries.Query.prototype.getTtl = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.lum.network.icqueries.Query} returns this
 */
proto.lum.network.icqueries.Query.prototype.setTtl = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * optional bool request_sent = 11;
 * @return {boolean}
 */
proto.lum.network.icqueries.Query.prototype.getRequestSent = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 11, false));
};


/**
 * @param {boolean} value
 * @return {!proto.lum.network.icqueries.Query} returns this
 */
proto.lum.network.icqueries.Query.prototype.setRequestSent = function(value) {
  return jspb.Message.setProto3BooleanField(this, 11, value);
};


/**
 * optional string extra_id = 12;
 * @return {string}
 */
proto.lum.network.icqueries.Query.prototype.getExtraId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.icqueries.Query} returns this
 */
proto.lum.network.icqueries.Query.prototype.setExtraId = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


