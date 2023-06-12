// source: desmos/reactions/v1/client/cli.proto
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

goog.provide('proto.desmos.reactions.v1.client.SetReactionsParamsJSON');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.desmos.reactions.v1.FreeTextValueParams');
goog.require('proto.desmos.reactions.v1.RegisteredReactionValueParams');

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
proto.desmos.reactions.v1.client.SetReactionsParamsJSON = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.reactions.v1.client.SetReactionsParamsJSON, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.reactions.v1.client.SetReactionsParamsJSON.displayName = 'proto.desmos.reactions.v1.client.SetReactionsParamsJSON';
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
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.reactions.v1.client.SetReactionsParamsJSON.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.reactions.v1.client.SetReactionsParamsJSON} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.toObject = function(includeInstance, msg) {
  var f, obj = {
    registeredReactionParams: (f = msg.getRegisteredReactionParams()) && proto.desmos.reactions.v1.RegisteredReactionValueParams.toObject(includeInstance, f),
    freeTextParams: (f = msg.getFreeTextParams()) && proto.desmos.reactions.v1.FreeTextValueParams.toObject(includeInstance, f)
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
 * @return {!proto.desmos.reactions.v1.client.SetReactionsParamsJSON}
 */
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.reactions.v1.client.SetReactionsParamsJSON;
  return proto.desmos.reactions.v1.client.SetReactionsParamsJSON.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.reactions.v1.client.SetReactionsParamsJSON} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.reactions.v1.client.SetReactionsParamsJSON}
 */
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.desmos.reactions.v1.RegisteredReactionValueParams;
      reader.readMessage(value,proto.desmos.reactions.v1.RegisteredReactionValueParams.deserializeBinaryFromReader);
      msg.setRegisteredReactionParams(value);
      break;
    case 2:
      var value = new proto.desmos.reactions.v1.FreeTextValueParams;
      reader.readMessage(value,proto.desmos.reactions.v1.FreeTextValueParams.deserializeBinaryFromReader);
      msg.setFreeTextParams(value);
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
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.reactions.v1.client.SetReactionsParamsJSON.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.reactions.v1.client.SetReactionsParamsJSON} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRegisteredReactionParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.desmos.reactions.v1.RegisteredReactionValueParams.serializeBinaryToWriter
    );
  }
  f = message.getFreeTextParams();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.desmos.reactions.v1.FreeTextValueParams.serializeBinaryToWriter
    );
  }
};


/**
 * optional desmos.reactions.v1.RegisteredReactionValueParams registered_reaction_params = 1;
 * @return {?proto.desmos.reactions.v1.RegisteredReactionValueParams}
 */
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.prototype.getRegisteredReactionParams = function() {
  return /** @type{?proto.desmos.reactions.v1.RegisteredReactionValueParams} */ (
    jspb.Message.getWrapperField(this, proto.desmos.reactions.v1.RegisteredReactionValueParams, 1));
};


/**
 * @param {?proto.desmos.reactions.v1.RegisteredReactionValueParams|undefined} value
 * @return {!proto.desmos.reactions.v1.client.SetReactionsParamsJSON} returns this
*/
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.prototype.setRegisteredReactionParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.reactions.v1.client.SetReactionsParamsJSON} returns this
 */
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.prototype.clearRegisteredReactionParams = function() {
  return this.setRegisteredReactionParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.prototype.hasRegisteredReactionParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional desmos.reactions.v1.FreeTextValueParams free_text_params = 2;
 * @return {?proto.desmos.reactions.v1.FreeTextValueParams}
 */
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.prototype.getFreeTextParams = function() {
  return /** @type{?proto.desmos.reactions.v1.FreeTextValueParams} */ (
    jspb.Message.getWrapperField(this, proto.desmos.reactions.v1.FreeTextValueParams, 2));
};


/**
 * @param {?proto.desmos.reactions.v1.FreeTextValueParams|undefined} value
 * @return {!proto.desmos.reactions.v1.client.SetReactionsParamsJSON} returns this
*/
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.prototype.setFreeTextParams = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.reactions.v1.client.SetReactionsParamsJSON} returns this
 */
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.prototype.clearFreeTextParams = function() {
  return this.setFreeTextParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.reactions.v1.client.SetReactionsParamsJSON.prototype.hasFreeTextParams = function() {
  return jspb.Message.getField(this, 2) != null;
};


