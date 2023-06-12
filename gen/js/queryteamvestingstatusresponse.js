// source: kyve/team/v1beta1/query.proto
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

goog.provide('proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kyve.team.v1beta1.QueryVestingPlan');
goog.require('proto.kyve.team.v1beta1.QueryVestingStatus');

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
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.displayName = 'proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse';
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
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    requestDate: jspb.Message.getFieldWithDefault(msg, 1, ""),
    plan: (f = msg.getPlan()) && proto.kyve.team.v1beta1.QueryVestingPlan.toObject(includeInstance, f),
    status: (f = msg.getStatus()) && proto.kyve.team.v1beta1.QueryVestingStatus.toObject(includeInstance, f)
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
 * @return {!proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse}
 */
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse;
  return proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse}
 */
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setRequestDate(value);
      break;
    case 2:
      var value = new proto.kyve.team.v1beta1.QueryVestingPlan;
      reader.readMessage(value,proto.kyve.team.v1beta1.QueryVestingPlan.deserializeBinaryFromReader);
      msg.setPlan(value);
      break;
    case 3:
      var value = new proto.kyve.team.v1beta1.QueryVestingStatus;
      reader.readMessage(value,proto.kyve.team.v1beta1.QueryVestingStatus.deserializeBinaryFromReader);
      msg.setStatus(value);
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
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRequestDate();
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
      proto.kyve.team.v1beta1.QueryVestingPlan.serializeBinaryToWriter
    );
  }
  f = message.getStatus();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.kyve.team.v1beta1.QueryVestingStatus.serializeBinaryToWriter
    );
  }
};


/**
 * optional string request_date = 1;
 * @return {string}
 */
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.prototype.getRequestDate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse} returns this
 */
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.prototype.setRequestDate = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional QueryVestingPlan plan = 2;
 * @return {?proto.kyve.team.v1beta1.QueryVestingPlan}
 */
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.prototype.getPlan = function() {
  return /** @type{?proto.kyve.team.v1beta1.QueryVestingPlan} */ (
    jspb.Message.getWrapperField(this, proto.kyve.team.v1beta1.QueryVestingPlan, 2));
};


/**
 * @param {?proto.kyve.team.v1beta1.QueryVestingPlan|undefined} value
 * @return {!proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse} returns this
*/
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.prototype.setPlan = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse} returns this
 */
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.prototype.clearPlan = function() {
  return this.setPlan(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.prototype.hasPlan = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional QueryVestingStatus status = 3;
 * @return {?proto.kyve.team.v1beta1.QueryVestingStatus}
 */
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.prototype.getStatus = function() {
  return /** @type{?proto.kyve.team.v1beta1.QueryVestingStatus} */ (
    jspb.Message.getWrapperField(this, proto.kyve.team.v1beta1.QueryVestingStatus, 3));
};


/**
 * @param {?proto.kyve.team.v1beta1.QueryVestingStatus|undefined} value
 * @return {!proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse} returns this
*/
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.prototype.setStatus = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse} returns this
 */
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.prototype.clearStatus = function() {
  return this.setStatus(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.team.v1beta1.QueryTeamVestingStatusResponse.prototype.hasStatus = function() {
  return jspb.Message.getField(this, 3) != null;
};


