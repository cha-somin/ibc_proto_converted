// source: secret/registration/v1beta1/remote_attestation/types.proto
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

goog.provide('proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.secret.registration.remote_attestation.v1beta1.SGXEC256Signature');

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
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.displayName = 'proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob';
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
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.toObject = function(opt_includeInstance) {
  return proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.toObject = function(includeInstance, msg) {
  var f, obj = {
    sgxEpidGroupFlags: jspb.Message.getFieldWithDefault(msg, 1, 0),
    sgxTcbEvaluationFlags: jspb.Message.getFieldWithDefault(msg, 2, 0),
    pseEvaluationFlags: jspb.Message.getFieldWithDefault(msg, 3, 0),
    latestEquivalentTcbPsvn: jspb.Message.getFieldWithDefault(msg, 4, ""),
    latestPseIsvsvn: jspb.Message.getFieldWithDefault(msg, 5, ""),
    latestPsdaSvn: jspb.Message.getFieldWithDefault(msg, 6, ""),
    xeid: jspb.Message.getFieldWithDefault(msg, 7, 0),
    gid: jspb.Message.getFieldWithDefault(msg, 8, 0),
    sgxEc256SignatureT: (f = msg.getSgxEc256SignatureT()) && proto.secret.registration.remote_attestation.v1beta1.SGXEC256Signature.toObject(includeInstance, f)
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
 * @return {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob}
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob;
  return proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob}
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setSgxEpidGroupFlags(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setSgxTcbEvaluationFlags(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setPseEvaluationFlags(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setLatestEquivalentTcbPsvn(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setLatestPseIsvsvn(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setLatestPsdaSvn(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setXeid(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setGid(value);
      break;
    case 9:
      var value = new proto.secret.registration.remote_attestation.v1beta1.SGXEC256Signature;
      reader.readMessage(value,proto.secret.registration.remote_attestation.v1beta1.SGXEC256Signature.deserializeBinaryFromReader);
      msg.setSgxEc256SignatureT(value);
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
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSgxEpidGroupFlags();
  if (f !== 0) {
    writer.writeUint32(
      1,
      f
    );
  }
  f = message.getSgxTcbEvaluationFlags();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getPseEvaluationFlags();
  if (f !== 0) {
    writer.writeUint32(
      3,
      f
    );
  }
  f = message.getLatestEquivalentTcbPsvn();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getLatestPseIsvsvn();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getLatestPsdaSvn();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getXeid();
  if (f !== 0) {
    writer.writeUint32(
      7,
      f
    );
  }
  f = message.getGid();
  if (f !== 0) {
    writer.writeUint32(
      8,
      f
    );
  }
  f = message.getSgxEc256SignatureT();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.secret.registration.remote_attestation.v1beta1.SGXEC256Signature.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint32 sgx_epid_group_flags = 1;
 * @return {number}
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.getSgxEpidGroupFlags = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.setSgxEpidGroupFlags = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint32 sgx_tcb_evaluation_flags = 2;
 * @return {number}
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.getSgxTcbEvaluationFlags = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.setSgxTcbEvaluationFlags = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint32 pse_evaluation_flags = 3;
 * @return {number}
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.getPseEvaluationFlags = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.setPseEvaluationFlags = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string latest_equivalent_tcb_psvn = 4;
 * @return {string}
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.getLatestEquivalentTcbPsvn = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.setLatestEquivalentTcbPsvn = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string latest_pse_isvsvn = 5;
 * @return {string}
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.getLatestPseIsvsvn = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.setLatestPseIsvsvn = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string latest_psda_svn = 6;
 * @return {string}
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.getLatestPsdaSvn = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.setLatestPsdaSvn = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional uint32 xeid = 7;
 * @return {number}
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.getXeid = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.setXeid = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional uint32 gid = 8;
 * @return {number}
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.getGid = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.setGid = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional SGXEC256Signature sgx_ec256_signature_t = 9;
 * @return {?proto.secret.registration.remote_attestation.v1beta1.SGXEC256Signature}
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.getSgxEc256SignatureT = function() {
  return /** @type{?proto.secret.registration.remote_attestation.v1beta1.SGXEC256Signature} */ (
    jspb.Message.getWrapperField(this, proto.secret.registration.remote_attestation.v1beta1.SGXEC256Signature, 9));
};


/**
 * @param {?proto.secret.registration.remote_attestation.v1beta1.SGXEC256Signature|undefined} value
 * @return {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} returns this
*/
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.setSgxEc256SignatureT = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob} returns this
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.clearSgxEc256SignatureT = function() {
  return this.setSgxEc256SignatureT(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.secret.registration.remote_attestation.v1beta1.PlatformInfoBlob.prototype.hasSgxEc256SignatureT = function() {
  return jspb.Message.getField(this, 9) != null;
};


