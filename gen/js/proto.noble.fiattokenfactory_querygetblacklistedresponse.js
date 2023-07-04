// source: noble/fiattokenfactory/query.proto
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

goog.provide('proto.noble.fiattokenfactory.QueryGetBlacklistedResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.noble.fiattokenfactory.Blacklisted');

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
proto.noble.fiattokenfactory.QueryGetBlacklistedResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.noble.fiattokenfactory.QueryGetBlacklistedResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.displayName = 'proto.noble.fiattokenfactory.QueryGetBlacklistedResponse';
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
proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.noble.fiattokenfactory.QueryGetBlacklistedResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    blacklisted: (f = msg.getBlacklisted()) && proto.noble.fiattokenfactory.Blacklisted.toObject(includeInstance, f)
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
 * @return {!proto.noble.fiattokenfactory.QueryGetBlacklistedResponse}
 */
proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.noble.fiattokenfactory.QueryGetBlacklistedResponse;
  return proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.noble.fiattokenfactory.QueryGetBlacklistedResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.noble.fiattokenfactory.QueryGetBlacklistedResponse}
 */
proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.noble.fiattokenfactory.Blacklisted;
      reader.readMessage(value,proto.noble.fiattokenfactory.Blacklisted.deserializeBinaryFromReader);
      msg.setBlacklisted(value);
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
proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.noble.fiattokenfactory.QueryGetBlacklistedResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBlacklisted();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.noble.fiattokenfactory.Blacklisted.serializeBinaryToWriter
    );
  }
};


/**
 * optional Blacklisted blacklisted = 1;
 * @return {?proto.noble.fiattokenfactory.Blacklisted}
 */
proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.prototype.getBlacklisted = function() {
  return /** @type{?proto.noble.fiattokenfactory.Blacklisted} */ (
    jspb.Message.getWrapperField(this, proto.noble.fiattokenfactory.Blacklisted, 1));
};


/**
 * @param {?proto.noble.fiattokenfactory.Blacklisted|undefined} value
 * @return {!proto.noble.fiattokenfactory.QueryGetBlacklistedResponse} returns this
*/
proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.prototype.setBlacklisted = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.noble.fiattokenfactory.QueryGetBlacklistedResponse} returns this
 */
proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.prototype.clearBlacklisted = function() {
  return this.setBlacklisted(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.noble.fiattokenfactory.QueryGetBlacklistedResponse.prototype.hasBlacklisted = function() {
  return jspb.Message.getField(this, 1) != null;
};

