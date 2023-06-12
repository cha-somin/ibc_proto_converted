// source: kyve/delegation/v1beta1/events.proto
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

goog.provide('proto.kyve.delegation.v1beta1.EventUpdateParams');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kyve.delegation.v1beta1.Params');

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
proto.kyve.delegation.v1beta1.EventUpdateParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.delegation.v1beta1.EventUpdateParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.delegation.v1beta1.EventUpdateParams.displayName = 'proto.kyve.delegation.v1beta1.EventUpdateParams';
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
proto.kyve.delegation.v1beta1.EventUpdateParams.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.delegation.v1beta1.EventUpdateParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.delegation.v1beta1.EventUpdateParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.delegation.v1beta1.EventUpdateParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    oldParams: (f = msg.getOldParams()) && proto.kyve.delegation.v1beta1.Params.toObject(includeInstance, f),
    newParams: (f = msg.getNewParams()) && proto.kyve.delegation.v1beta1.Params.toObject(includeInstance, f),
    payload: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.kyve.delegation.v1beta1.EventUpdateParams}
 */
proto.kyve.delegation.v1beta1.EventUpdateParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.delegation.v1beta1.EventUpdateParams;
  return proto.kyve.delegation.v1beta1.EventUpdateParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.delegation.v1beta1.EventUpdateParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.delegation.v1beta1.EventUpdateParams}
 */
proto.kyve.delegation.v1beta1.EventUpdateParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.kyve.delegation.v1beta1.Params;
      reader.readMessage(value,proto.kyve.delegation.v1beta1.Params.deserializeBinaryFromReader);
      msg.setOldParams(value);
      break;
    case 2:
      var value = new proto.kyve.delegation.v1beta1.Params;
      reader.readMessage(value,proto.kyve.delegation.v1beta1.Params.deserializeBinaryFromReader);
      msg.setNewParams(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setPayload(value);
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
proto.kyve.delegation.v1beta1.EventUpdateParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.delegation.v1beta1.EventUpdateParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.delegation.v1beta1.EventUpdateParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.delegation.v1beta1.EventUpdateParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOldParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.kyve.delegation.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getNewParams();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.kyve.delegation.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getPayload();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional Params old_params = 1;
 * @return {?proto.kyve.delegation.v1beta1.Params}
 */
proto.kyve.delegation.v1beta1.EventUpdateParams.prototype.getOldParams = function() {
  return /** @type{?proto.kyve.delegation.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.kyve.delegation.v1beta1.Params, 1));
};


/**
 * @param {?proto.kyve.delegation.v1beta1.Params|undefined} value
 * @return {!proto.kyve.delegation.v1beta1.EventUpdateParams} returns this
*/
proto.kyve.delegation.v1beta1.EventUpdateParams.prototype.setOldParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.delegation.v1beta1.EventUpdateParams} returns this
 */
proto.kyve.delegation.v1beta1.EventUpdateParams.prototype.clearOldParams = function() {
  return this.setOldParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.delegation.v1beta1.EventUpdateParams.prototype.hasOldParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Params new_params = 2;
 * @return {?proto.kyve.delegation.v1beta1.Params}
 */
proto.kyve.delegation.v1beta1.EventUpdateParams.prototype.getNewParams = function() {
  return /** @type{?proto.kyve.delegation.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.kyve.delegation.v1beta1.Params, 2));
};


/**
 * @param {?proto.kyve.delegation.v1beta1.Params|undefined} value
 * @return {!proto.kyve.delegation.v1beta1.EventUpdateParams} returns this
*/
proto.kyve.delegation.v1beta1.EventUpdateParams.prototype.setNewParams = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.delegation.v1beta1.EventUpdateParams} returns this
 */
proto.kyve.delegation.v1beta1.EventUpdateParams.prototype.clearNewParams = function() {
  return this.setNewParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.delegation.v1beta1.EventUpdateParams.prototype.hasNewParams = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional string payload = 3;
 * @return {string}
 */
proto.kyve.delegation.v1beta1.EventUpdateParams.prototype.getPayload = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.delegation.v1beta1.EventUpdateParams} returns this
 */
proto.kyve.delegation.v1beta1.EventUpdateParams.prototype.setPayload = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


