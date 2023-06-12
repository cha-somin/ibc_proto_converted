// source: shentu/gov/v1alpha1/gov.proto
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

goog.provide('proto.shentu.gov.v1alpha1.CustomParams');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.gov.v1beta1.TallyParams');

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
proto.shentu.gov.v1alpha1.CustomParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.shentu.gov.v1alpha1.CustomParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.shentu.gov.v1alpha1.CustomParams.displayName = 'proto.shentu.gov.v1alpha1.CustomParams';
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
proto.shentu.gov.v1alpha1.CustomParams.prototype.toObject = function(opt_includeInstance) {
  return proto.shentu.gov.v1alpha1.CustomParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.shentu.gov.v1alpha1.CustomParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.gov.v1alpha1.CustomParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    certifierUpdateSecurityVoteTally: (f = msg.getCertifierUpdateSecurityVoteTally()) && proto.cosmos.gov.v1beta1.TallyParams.toObject(includeInstance, f),
    certifierUpdateStakeVoteTally: (f = msg.getCertifierUpdateStakeVoteTally()) && proto.cosmos.gov.v1beta1.TallyParams.toObject(includeInstance, f)
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
 * @return {!proto.shentu.gov.v1alpha1.CustomParams}
 */
proto.shentu.gov.v1alpha1.CustomParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.shentu.gov.v1alpha1.CustomParams;
  return proto.shentu.gov.v1alpha1.CustomParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.shentu.gov.v1alpha1.CustomParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.shentu.gov.v1alpha1.CustomParams}
 */
proto.shentu.gov.v1alpha1.CustomParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.gov.v1beta1.TallyParams;
      reader.readMessage(value,proto.cosmos.gov.v1beta1.TallyParams.deserializeBinaryFromReader);
      msg.setCertifierUpdateSecurityVoteTally(value);
      break;
    case 2:
      var value = new proto.cosmos.gov.v1beta1.TallyParams;
      reader.readMessage(value,proto.cosmos.gov.v1beta1.TallyParams.deserializeBinaryFromReader);
      msg.setCertifierUpdateStakeVoteTally(value);
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
proto.shentu.gov.v1alpha1.CustomParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.shentu.gov.v1alpha1.CustomParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.shentu.gov.v1alpha1.CustomParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.gov.v1alpha1.CustomParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCertifierUpdateSecurityVoteTally();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.gov.v1beta1.TallyParams.serializeBinaryToWriter
    );
  }
  f = message.getCertifierUpdateStakeVoteTally();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.gov.v1beta1.TallyParams.serializeBinaryToWriter
    );
  }
};


/**
 * optional cosmos.gov.v1beta1.TallyParams certifier_update_security_vote_tally = 1;
 * @return {?proto.cosmos.gov.v1beta1.TallyParams}
 */
proto.shentu.gov.v1alpha1.CustomParams.prototype.getCertifierUpdateSecurityVoteTally = function() {
  return /** @type{?proto.cosmos.gov.v1beta1.TallyParams} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.gov.v1beta1.TallyParams, 1));
};


/**
 * @param {?proto.cosmos.gov.v1beta1.TallyParams|undefined} value
 * @return {!proto.shentu.gov.v1alpha1.CustomParams} returns this
*/
proto.shentu.gov.v1alpha1.CustomParams.prototype.setCertifierUpdateSecurityVoteTally = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.gov.v1alpha1.CustomParams} returns this
 */
proto.shentu.gov.v1alpha1.CustomParams.prototype.clearCertifierUpdateSecurityVoteTally = function() {
  return this.setCertifierUpdateSecurityVoteTally(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.gov.v1alpha1.CustomParams.prototype.hasCertifierUpdateSecurityVoteTally = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional cosmos.gov.v1beta1.TallyParams certifier_update_stake_vote_tally = 2;
 * @return {?proto.cosmos.gov.v1beta1.TallyParams}
 */
proto.shentu.gov.v1alpha1.CustomParams.prototype.getCertifierUpdateStakeVoteTally = function() {
  return /** @type{?proto.cosmos.gov.v1beta1.TallyParams} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.gov.v1beta1.TallyParams, 2));
};


/**
 * @param {?proto.cosmos.gov.v1beta1.TallyParams|undefined} value
 * @return {!proto.shentu.gov.v1alpha1.CustomParams} returns this
*/
proto.shentu.gov.v1alpha1.CustomParams.prototype.setCertifierUpdateStakeVoteTally = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.gov.v1alpha1.CustomParams} returns this
 */
proto.shentu.gov.v1alpha1.CustomParams.prototype.clearCertifierUpdateStakeVoteTally = function() {
  return this.setCertifierUpdateStakeVoteTally(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.gov.v1alpha1.CustomParams.prototype.hasCertifierUpdateStakeVoteTally = function() {
  return jspb.Message.getField(this, 2) != null;
};


