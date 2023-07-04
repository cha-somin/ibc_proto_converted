// source: ibc/applications/interchain_accounts/genesis/v1/genesis.proto
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

goog.provide('proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel');

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
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.displayName = 'proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel';
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
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.toObject = function(includeInstance, msg) {
  var f, obj = {
    connectionId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    portId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    channelId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    isMiddlewareEnabled: jspb.Message.getBooleanFieldWithDefault(msg, 4, false)
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
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel;
  return proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setConnectionId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setPortId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setChannelId(value);
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsMiddlewareEnabled(value);
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
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConnectionId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPortId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getChannelId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getIsMiddlewareEnabled();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
};


/**
 * optional string connection_id = 1;
 * @return {string}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.prototype.getConnectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel} returns this
 */
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.prototype.setConnectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string port_id = 2;
 * @return {string}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.prototype.getPortId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel} returns this
 */
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.prototype.setPortId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string channel_id = 3;
 * @return {string}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.prototype.getChannelId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel} returns this
 */
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.prototype.setChannelId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional bool is_middleware_enabled = 4;
 * @return {boolean}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.prototype.getIsMiddlewareEnabled = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel} returns this
 */
proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.prototype.setIsMiddlewareEnabled = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};

