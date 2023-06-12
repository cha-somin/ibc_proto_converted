// source: em/authority/v1/tx.proto
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

goog.provide('proto.em.authority.v1.MsgScheduleUpgrade');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.upgrade.v1beta1.Plan');

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
proto.em.authority.v1.MsgScheduleUpgrade = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.em.authority.v1.MsgScheduleUpgrade, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.em.authority.v1.MsgScheduleUpgrade.displayName = 'proto.em.authority.v1.MsgScheduleUpgrade';
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
proto.em.authority.v1.MsgScheduleUpgrade.prototype.toObject = function(opt_includeInstance) {
  return proto.em.authority.v1.MsgScheduleUpgrade.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.em.authority.v1.MsgScheduleUpgrade} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.authority.v1.MsgScheduleUpgrade.toObject = function(includeInstance, msg) {
  var f, obj = {
    authority: jspb.Message.getFieldWithDefault(msg, 1, ""),
    plan: (f = msg.getPlan()) && proto.cosmos.upgrade.v1beta1.Plan.toObject(includeInstance, f)
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
 * @return {!proto.em.authority.v1.MsgScheduleUpgrade}
 */
proto.em.authority.v1.MsgScheduleUpgrade.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.em.authority.v1.MsgScheduleUpgrade;
  return proto.em.authority.v1.MsgScheduleUpgrade.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.em.authority.v1.MsgScheduleUpgrade} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.em.authority.v1.MsgScheduleUpgrade}
 */
proto.em.authority.v1.MsgScheduleUpgrade.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAuthority(value);
      break;
    case 2:
      var value = new proto.cosmos.upgrade.v1beta1.Plan;
      reader.readMessage(value,proto.cosmos.upgrade.v1beta1.Plan.deserializeBinaryFromReader);
      msg.setPlan(value);
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
proto.em.authority.v1.MsgScheduleUpgrade.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.em.authority.v1.MsgScheduleUpgrade.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.em.authority.v1.MsgScheduleUpgrade} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.authority.v1.MsgScheduleUpgrade.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAuthority();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPlan();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.upgrade.v1beta1.Plan.serializeBinaryToWriter
    );
  }
};


/**
 * optional string authority = 1;
 * @return {string}
 */
proto.em.authority.v1.MsgScheduleUpgrade.prototype.getAuthority = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.authority.v1.MsgScheduleUpgrade} returns this
 */
proto.em.authority.v1.MsgScheduleUpgrade.prototype.setAuthority = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional cosmos.upgrade.v1beta1.Plan plan = 2;
 * @return {?proto.cosmos.upgrade.v1beta1.Plan}
 */
proto.em.authority.v1.MsgScheduleUpgrade.prototype.getPlan = function() {
  return /** @type{?proto.cosmos.upgrade.v1beta1.Plan} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.upgrade.v1beta1.Plan, 2));
};


/**
 * @param {?proto.cosmos.upgrade.v1beta1.Plan|undefined} value
 * @return {!proto.em.authority.v1.MsgScheduleUpgrade} returns this
*/
proto.em.authority.v1.MsgScheduleUpgrade.prototype.setPlan = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.em.authority.v1.MsgScheduleUpgrade} returns this
 */
proto.em.authority.v1.MsgScheduleUpgrade.prototype.clearPlan = function() {
  return this.setPlan(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.em.authority.v1.MsgScheduleUpgrade.prototype.hasPlan = function() {
  return jspb.Message.getField(this, 2) != null;
};


