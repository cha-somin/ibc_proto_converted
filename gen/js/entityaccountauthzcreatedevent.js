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

goog.provide('proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ixo.entity.v1beta1.Grant');

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
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.displayName = 'proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent';
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
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    signer: jspb.Message.getFieldWithDefault(msg, 2, ""),
    accountName: jspb.Message.getFieldWithDefault(msg, 3, ""),
    granter: jspb.Message.getFieldWithDefault(msg, 4, ""),
    grantee: jspb.Message.getFieldWithDefault(msg, 5, ""),
    grant: (f = msg.getGrant()) && proto.ixo.entity.v1beta1.Grant.toObject(includeInstance, f)
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
 * @return {!proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent}
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent;
  return proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent}
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setSigner(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAccountName(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setGranter(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setGrantee(value);
      break;
    case 6:
      var value = new proto.ixo.entity.v1beta1.Grant;
      reader.readMessage(value,proto.ixo.entity.v1beta1.Grant.deserializeBinaryFromReader);
      msg.setGrant(value);
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
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSigner();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAccountName();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getGranter();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getGrantee();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getGrant();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.ixo.entity.v1beta1.Grant.serializeBinaryToWriter
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent} returns this
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string signer = 2;
 * @return {string}
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.getSigner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent} returns this
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.setSigner = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string account_name = 3;
 * @return {string}
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.getAccountName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent} returns this
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.setAccountName = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string granter = 4;
 * @return {string}
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.getGranter = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent} returns this
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.setGranter = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string grantee = 5;
 * @return {string}
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.getGrantee = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent} returns this
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.setGrantee = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional Grant grant = 6;
 * @return {?proto.ixo.entity.v1beta1.Grant}
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.getGrant = function() {
  return /** @type{?proto.ixo.entity.v1beta1.Grant} */ (
    jspb.Message.getWrapperField(this, proto.ixo.entity.v1beta1.Grant, 6));
};


/**
 * @param {?proto.ixo.entity.v1beta1.Grant|undefined} value
 * @return {!proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent} returns this
*/
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.setGrant = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent} returns this
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.clearGrant = function() {
  return this.setGrant(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.entity.v1beta1.EntityAccountAuthzCreatedEvent.prototype.hasGrant = function() {
  return jspb.Message.getField(this, 6) != null;
};


