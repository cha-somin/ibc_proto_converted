// source: desmos/reactions/v1/models.proto
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

goog.provide('proto.desmos.reactions.v1.SubspaceReactionsParams');

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
proto.desmos.reactions.v1.SubspaceReactionsParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.reactions.v1.SubspaceReactionsParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.reactions.v1.SubspaceReactionsParams.displayName = 'proto.desmos.reactions.v1.SubspaceReactionsParams';
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
proto.desmos.reactions.v1.SubspaceReactionsParams.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.reactions.v1.SubspaceReactionsParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.reactions.v1.SubspaceReactionsParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.reactions.v1.SubspaceReactionsParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    subspaceId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    registeredReaction: (f = msg.getRegisteredReaction()) && proto.desmos.reactions.v1.RegisteredReactionValueParams.toObject(includeInstance, f),
    freeText: (f = msg.getFreeText()) && proto.desmos.reactions.v1.FreeTextValueParams.toObject(includeInstance, f)
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
 * @return {!proto.desmos.reactions.v1.SubspaceReactionsParams}
 */
proto.desmos.reactions.v1.SubspaceReactionsParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.reactions.v1.SubspaceReactionsParams;
  return proto.desmos.reactions.v1.SubspaceReactionsParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.reactions.v1.SubspaceReactionsParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.reactions.v1.SubspaceReactionsParams}
 */
proto.desmos.reactions.v1.SubspaceReactionsParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSubspaceId(value);
      break;
    case 2:
      var value = new proto.desmos.reactions.v1.RegisteredReactionValueParams;
      reader.readMessage(value,proto.desmos.reactions.v1.RegisteredReactionValueParams.deserializeBinaryFromReader);
      msg.setRegisteredReaction(value);
      break;
    case 3:
      var value = new proto.desmos.reactions.v1.FreeTextValueParams;
      reader.readMessage(value,proto.desmos.reactions.v1.FreeTextValueParams.deserializeBinaryFromReader);
      msg.setFreeText(value);
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
proto.desmos.reactions.v1.SubspaceReactionsParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.reactions.v1.SubspaceReactionsParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.reactions.v1.SubspaceReactionsParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.reactions.v1.SubspaceReactionsParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubspaceId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getRegisteredReaction();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.desmos.reactions.v1.RegisteredReactionValueParams.serializeBinaryToWriter
    );
  }
  f = message.getFreeText();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.desmos.reactions.v1.FreeTextValueParams.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 subspace_id = 1;
 * @return {number}
 */
proto.desmos.reactions.v1.SubspaceReactionsParams.prototype.getSubspaceId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.reactions.v1.SubspaceReactionsParams} returns this
 */
proto.desmos.reactions.v1.SubspaceReactionsParams.prototype.setSubspaceId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional RegisteredReactionValueParams registered_reaction = 2;
 * @return {?proto.desmos.reactions.v1.RegisteredReactionValueParams}
 */
proto.desmos.reactions.v1.SubspaceReactionsParams.prototype.getRegisteredReaction = function() {
  return /** @type{?proto.desmos.reactions.v1.RegisteredReactionValueParams} */ (
    jspb.Message.getWrapperField(this, proto.desmos.reactions.v1.RegisteredReactionValueParams, 2));
};


/**
 * @param {?proto.desmos.reactions.v1.RegisteredReactionValueParams|undefined} value
 * @return {!proto.desmos.reactions.v1.SubspaceReactionsParams} returns this
*/
proto.desmos.reactions.v1.SubspaceReactionsParams.prototype.setRegisteredReaction = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.reactions.v1.SubspaceReactionsParams} returns this
 */
proto.desmos.reactions.v1.SubspaceReactionsParams.prototype.clearRegisteredReaction = function() {
  return this.setRegisteredReaction(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.reactions.v1.SubspaceReactionsParams.prototype.hasRegisteredReaction = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional FreeTextValueParams free_text = 3;
 * @return {?proto.desmos.reactions.v1.FreeTextValueParams}
 */
proto.desmos.reactions.v1.SubspaceReactionsParams.prototype.getFreeText = function() {
  return /** @type{?proto.desmos.reactions.v1.FreeTextValueParams} */ (
    jspb.Message.getWrapperField(this, proto.desmos.reactions.v1.FreeTextValueParams, 3));
};


/**
 * @param {?proto.desmos.reactions.v1.FreeTextValueParams|undefined} value
 * @return {!proto.desmos.reactions.v1.SubspaceReactionsParams} returns this
*/
proto.desmos.reactions.v1.SubspaceReactionsParams.prototype.setFreeText = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.reactions.v1.SubspaceReactionsParams} returns this
 */
proto.desmos.reactions.v1.SubspaceReactionsParams.prototype.clearFreeText = function() {
  return this.setFreeText(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.reactions.v1.SubspaceReactionsParams.prototype.hasFreeText = function() {
  return jspb.Message.getField(this, 3) != null;
};


