// source: ixo/entity/v1beta1/event.proto
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

goog.provide('proto.ixo.entity.v1beta1.EntityCreatedEvent');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ixo.entity.v1beta1.Entity');

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
proto.ixo.entity.v1beta1.EntityCreatedEvent = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ixo.entity.v1beta1.EntityCreatedEvent, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.entity.v1beta1.EntityCreatedEvent.displayName = 'proto.ixo.entity.v1beta1.EntityCreatedEvent';
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
proto.ixo.entity.v1beta1.EntityCreatedEvent.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.entity.v1beta1.EntityCreatedEvent.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.entity.v1beta1.EntityCreatedEvent} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.entity.v1beta1.EntityCreatedEvent.toObject = function(includeInstance, msg) {
  var f, obj = {
    entity: (f = msg.getEntity()) && proto.ixo.entity.v1beta1.Entity.toObject(includeInstance, f),
    signer: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.ixo.entity.v1beta1.EntityCreatedEvent}
 */
proto.ixo.entity.v1beta1.EntityCreatedEvent.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.entity.v1beta1.EntityCreatedEvent;
  return proto.ixo.entity.v1beta1.EntityCreatedEvent.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.entity.v1beta1.EntityCreatedEvent} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.entity.v1beta1.EntityCreatedEvent}
 */
proto.ixo.entity.v1beta1.EntityCreatedEvent.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.ixo.entity.v1beta1.Entity;
      reader.readMessage(value,proto.ixo.entity.v1beta1.Entity.deserializeBinaryFromReader);
      msg.setEntity(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setSigner(value);
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
proto.ixo.entity.v1beta1.EntityCreatedEvent.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.entity.v1beta1.EntityCreatedEvent.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.entity.v1beta1.EntityCreatedEvent} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.entity.v1beta1.EntityCreatedEvent.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEntity();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.ixo.entity.v1beta1.Entity.serializeBinaryToWriter
    );
  }
  f = message.getSigner();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional Entity entity = 1;
 * @return {?proto.ixo.entity.v1beta1.Entity}
 */
proto.ixo.entity.v1beta1.EntityCreatedEvent.prototype.getEntity = function() {
  return /** @type{?proto.ixo.entity.v1beta1.Entity} */ (
    jspb.Message.getWrapperField(this, proto.ixo.entity.v1beta1.Entity, 1));
};


/**
 * @param {?proto.ixo.entity.v1beta1.Entity|undefined} value
 * @return {!proto.ixo.entity.v1beta1.EntityCreatedEvent} returns this
*/
proto.ixo.entity.v1beta1.EntityCreatedEvent.prototype.setEntity = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.entity.v1beta1.EntityCreatedEvent} returns this
 */
proto.ixo.entity.v1beta1.EntityCreatedEvent.prototype.clearEntity = function() {
  return this.setEntity(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.entity.v1beta1.EntityCreatedEvent.prototype.hasEntity = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string signer = 2;
 * @return {string}
 */
proto.ixo.entity.v1beta1.EntityCreatedEvent.prototype.getSigner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.entity.v1beta1.EntityCreatedEvent} returns this
 */
proto.ixo.entity.v1beta1.EntityCreatedEvent.prototype.setSigner = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};

