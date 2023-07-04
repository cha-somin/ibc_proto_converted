// source: ixo/claims/v1beta1/authz.proto
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

goog.provide('proto.ixo.claims.v1beta1.EvaluateClaimAuthorization');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ixo.claims.v1beta1.EvaluateClaimConstraints');

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
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.repeatedFields_, null);
};
goog.inherits(proto.ixo.claims.v1beta1.EvaluateClaimAuthorization, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.displayName = 'proto.ixo.claims.v1beta1.EvaluateClaimAuthorization';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.repeatedFields_ = [2];



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
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.claims.v1beta1.EvaluateClaimAuthorization} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.toObject = function(includeInstance, msg) {
  var f, obj = {
    admin: jspb.Message.getFieldWithDefault(msg, 1, ""),
    constraintsList: jspb.Message.toObjectList(msg.getConstraintsList(),
    proto.ixo.claims.v1beta1.EvaluateClaimConstraints.toObject, includeInstance)
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
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimAuthorization}
 */
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.claims.v1beta1.EvaluateClaimAuthorization;
  return proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.claims.v1beta1.EvaluateClaimAuthorization} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimAuthorization}
 */
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAdmin(value);
      break;
    case 2:
      var value = new proto.ixo.claims.v1beta1.EvaluateClaimConstraints;
      reader.readMessage(value,proto.ixo.claims.v1beta1.EvaluateClaimConstraints.deserializeBinaryFromReader);
      msg.addConstraints(value);
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
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.claims.v1beta1.EvaluateClaimAuthorization} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAdmin();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getConstraintsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.ixo.claims.v1beta1.EvaluateClaimConstraints.serializeBinaryToWriter
    );
  }
};


/**
 * optional string admin = 1;
 * @return {string}
 */
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.prototype.getAdmin = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimAuthorization} returns this
 */
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.prototype.setAdmin = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated EvaluateClaimConstraints constraints = 2;
 * @return {!Array<!proto.ixo.claims.v1beta1.EvaluateClaimConstraints>}
 */
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.prototype.getConstraintsList = function() {
  return /** @type{!Array<!proto.ixo.claims.v1beta1.EvaluateClaimConstraints>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ixo.claims.v1beta1.EvaluateClaimConstraints, 2));
};


/**
 * @param {!Array<!proto.ixo.claims.v1beta1.EvaluateClaimConstraints>} value
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimAuthorization} returns this
*/
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.prototype.setConstraintsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimConstraints}
 */
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.prototype.addConstraints = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.ixo.claims.v1beta1.EvaluateClaimConstraints, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.claims.v1beta1.EvaluateClaimAuthorization} returns this
 */
proto.ixo.claims.v1beta1.EvaluateClaimAuthorization.prototype.clearConstraintsList = function() {
  return this.setConstraintsList([]);
};

