# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from mars.safety.v1beta1 import tx_pb2 as mars_dot_safety_dot_v1beta1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the safety module's Msg service
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.SafetyFundSpend = channel.unary_unary(
                '/mars.safety.v1beta1.Msg/SafetyFundSpend',
                request_serializer=mars_dot_safety_dot_v1beta1_dot_tx__pb2.MsgSafetyFundSpend.SerializeToString,
                response_deserializer=mars_dot_safety_dot_v1beta1_dot_tx__pb2.MsgSafetyFundSpendResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the safety module's Msg service
    """

    def SafetyFundSpend(self, request, context):
        """SafetyFundSpend is a governance operation for sending tokens from the
        safety fund module account to the designated recipient.

        NOTE: For now, this is just a copy of the distribution module's
        `CommunityFundSpend` method. The recipient is expected to be a multisig
        consisting of trusted community members who are respondible for using the
        funds appropriately to cover any bad debt.

        In the long term, the goal is that the module
        is able to detect bad debts incurred in the outposts via interchain query,
        and automatically dispense the appropriate amount of funds, without having
        to go through the governance process.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'SafetyFundSpend': grpc.unary_unary_rpc_method_handler(
                    servicer.SafetyFundSpend,
                    request_deserializer=mars_dot_safety_dot_v1beta1_dot_tx__pb2.MsgSafetyFundSpend.FromString,
                    response_serializer=mars_dot_safety_dot_v1beta1_dot_tx__pb2.MsgSafetyFundSpendResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'mars.safety.v1beta1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the safety module's Msg service
    """

    @staticmethod
    def SafetyFundSpend(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/mars.safety.v1beta1.Msg/SafetyFundSpend',
            mars_dot_safety_dot_v1beta1_dot_tx__pb2.MsgSafetyFundSpend.SerializeToString,
            mars_dot_safety_dot_v1beta1_dot_tx__pb2.MsgSafetyFundSpendResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
