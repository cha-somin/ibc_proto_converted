// source: ixo/entity/v1beta1/tx.proto
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

goog.provide('proto.ixo.entity.v1beta1.MsgUpdateEntity');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');

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
proto.ixo.entity.v1beta1.MsgUpdateEntity = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ixo.entity.v1beta1.MsgUpdateEntity.repeatedFields_, null);
};
goog.inherits(proto.ixo.entity.v1beta1.MsgUpdateEntity, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.entity.v1beta1.MsgUpdateEntity.displayName = 'proto.ixo.entity.v1beta1.MsgUpdateEntity';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.repeatedFields_ = [5];



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
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.entity.v1beta1.MsgUpdateEntity.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.entity.v1beta1.MsgUpdateEntity} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    entityStatus: jspb.Message.getFieldWithDefault(msg, 2, 0),
    startDate: (f = msg.getStartDate()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    endDate: (f = msg.getEndDate()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    credentialsList: (f = jspb.Message.getRepeatedField(msg, 5)) == null ? undefined : f,
    controllerDid: jspb.Message.getFieldWithDefault(msg, 6, ""),
    controllerAddress: jspb.Message.getFieldWithDefault(msg, 7, "")
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
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity}
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.entity.v1beta1.MsgUpdateEntity;
  return proto.ixo.entity.v1beta1.MsgUpdateEntity.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.entity.v1beta1.MsgUpdateEntity} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity}
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {number} */ (reader.readInt32());
      msg.setEntityStatus(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartDate(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setEndDate(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.addCredentials(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setControllerDid(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setControllerAddress(value);
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
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.entity.v1beta1.MsgUpdateEntity.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.entity.v1beta1.MsgUpdateEntity} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getEntityStatus();
  if (f !== 0) {
    writer.writeInt32(
      2,
      f
    );
  }
  f = message.getStartDate();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getEndDate();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getCredentialsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      5,
      f
    );
  }
  f = message.getControllerDid();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getControllerAddress();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity} returns this
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional int32 entity_status = 2;
 * @return {number}
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.getEntityStatus = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity} returns this
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.setEntityStatus = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional google.protobuf.Timestamp start_date = 3;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.getStartDate = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 3));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity} returns this
*/
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.setStartDate = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity} returns this
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.clearStartDate = function() {
  return this.setStartDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.hasStartDate = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional google.protobuf.Timestamp end_date = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.getEndDate = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity} returns this
*/
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.setEndDate = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity} returns this
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.clearEndDate = function() {
  return this.setEndDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.hasEndDate = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * repeated string credentials = 5;
 * @return {!Array<string>}
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.getCredentialsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 5));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity} returns this
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.setCredentialsList = function(value) {
  return jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity} returns this
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.addCredentials = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity} returns this
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.clearCredentialsList = function() {
  return this.setCredentialsList([]);
};


/**
 * optional string controller_did = 6;
 * @return {string}
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.getControllerDid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity} returns this
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.setControllerDid = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string controller_address = 7;
 * @return {string}
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.getControllerAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.entity.v1beta1.MsgUpdateEntity} returns this
 */
proto.ixo.entity.v1beta1.MsgUpdateEntity.prototype.setControllerAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


