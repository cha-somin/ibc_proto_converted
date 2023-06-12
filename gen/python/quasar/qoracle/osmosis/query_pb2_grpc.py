# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from quasar.qoracle.osmosis import query_pb2 as quasar_dot_qoracle_dot_osmosis_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/quasarlabs.quasarnode.qoracle.osmosis.Query/Params',
                request_serializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryParamsRequest.SerializeToString,
                response_deserializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.State = channel.unary_unary(
                '/quasarlabs.quasarnode.qoracle.osmosis.Query/State',
                request_serializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryStateRequest.SerializeToString,
                response_deserializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryStateResponse.FromString,
                )
        self.ChainParams = channel.unary_unary(
                '/quasarlabs.quasarnode.qoracle.osmosis.Query/ChainParams',
                request_serializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryChainParamsRequest.SerializeToString,
                response_deserializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryChainParamsResponse.FromString,
                )
        self.IncentivizedPools = channel.unary_unary(
                '/quasarlabs.quasarnode.qoracle.osmosis.Query/IncentivizedPools',
                request_serializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryIncentivizedPoolsRequest.SerializeToString,
                response_deserializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryIncentivizedPoolsResponse.FromString,
                )
        self.Pools = channel.unary_unary(
                '/quasarlabs.quasarnode.qoracle.osmosis.Query/Pools',
                request_serializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryPoolsRequest.SerializeToString,
                response_deserializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryPoolsResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Params(self, request, context):
        """Parameters queries the parameters of the module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def State(self, request, context):
        """Queries the state of oracle requests.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ChainParams(self, request, context):
        """Queries latest fetched params from osmosis chain.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def IncentivizedPools(self, request, context):
        """Queries latest fetched list of incentivized pools from osmosis.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Pools(self, request, context):
        """Queries latest fetched list of pool details from osmosis.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryParamsRequest.FromString,
                    response_serializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'State': grpc.unary_unary_rpc_method_handler(
                    servicer.State,
                    request_deserializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryStateRequest.FromString,
                    response_serializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryStateResponse.SerializeToString,
            ),
            'ChainParams': grpc.unary_unary_rpc_method_handler(
                    servicer.ChainParams,
                    request_deserializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryChainParamsRequest.FromString,
                    response_serializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryChainParamsResponse.SerializeToString,
            ),
            'IncentivizedPools': grpc.unary_unary_rpc_method_handler(
                    servicer.IncentivizedPools,
                    request_deserializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryIncentivizedPoolsRequest.FromString,
                    response_serializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryIncentivizedPoolsResponse.SerializeToString,
            ),
            'Pools': grpc.unary_unary_rpc_method_handler(
                    servicer.Pools,
                    request_deserializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryPoolsRequest.FromString,
                    response_serializer=quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryPoolsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'quasarlabs.quasarnode.qoracle.osmosis.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def Params(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quasarlabs.quasarnode.qoracle.osmosis.Query/Params',
            quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryParamsRequest.SerializeToString,
            quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def State(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quasarlabs.quasarnode.qoracle.osmosis.Query/State',
            quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryStateRequest.SerializeToString,
            quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryStateResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ChainParams(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quasarlabs.quasarnode.qoracle.osmosis.Query/ChainParams',
            quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryChainParamsRequest.SerializeToString,
            quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryChainParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def IncentivizedPools(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quasarlabs.quasarnode.qoracle.osmosis.Query/IncentivizedPools',
            quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryIncentivizedPoolsRequest.SerializeToString,
            quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryIncentivizedPoolsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Pools(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quasarlabs.quasarnode.qoracle.osmosis.Query/Pools',
            quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryPoolsRequest.SerializeToString,
            quasar_dot_qoracle_dot_osmosis_dot_query__pb2.QueryPoolsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
