# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from umee.incentive.v1 import query_pb2 as umee_dot_incentive_dot_v1_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Params = channel.unary_unary(
                '/umee.incentive.v1.Query/Params',
                request_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryParams.SerializeToString,
                response_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.TotalBonded = channel.unary_unary(
                '/umee.incentive.v1.Query/TotalBonded',
                request_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryTotalBonded.SerializeToString,
                response_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryTotalBondedResponse.FromString,
                )
        self.TotalUnbonding = channel.unary_unary(
                '/umee.incentive.v1.Query/TotalUnbonding',
                request_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryTotalUnbonding.SerializeToString,
                response_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryTotalUnbondingResponse.FromString,
                )
        self.AccountBonds = channel.unary_unary(
                '/umee.incentive.v1.Query/AccountBonds',
                request_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryAccountBonds.SerializeToString,
                response_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryAccountBondsResponse.FromString,
                )
        self.PendingRewards = channel.unary_unary(
                '/umee.incentive.v1.Query/PendingRewards',
                request_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryPendingRewards.SerializeToString,
                response_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryPendingRewardsResponse.FromString,
                )
        self.CompletedIncentivePrograms = channel.unary_unary(
                '/umee.incentive.v1.Query/CompletedIncentivePrograms',
                request_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryCompletedIncentivePrograms.SerializeToString,
                response_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryCompletedIncentiveProgramsResponse.FromString,
                )
        self.OngoingIncentivePrograms = channel.unary_unary(
                '/umee.incentive.v1.Query/OngoingIncentivePrograms',
                request_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryOngoingIncentivePrograms.SerializeToString,
                response_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryOngoingIncentiveProgramsResponse.FromString,
                )
        self.UpcomingIncentivePrograms = channel.unary_unary(
                '/umee.incentive.v1.Query/UpcomingIncentivePrograms',
                request_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryUpcomingIncentivePrograms.SerializeToString,
                response_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryUpcomingIncentiveProgramsResponse.FromString,
                )
        self.IncentiveProgram = channel.unary_unary(
                '/umee.incentive.v1.Query/IncentiveProgram',
                request_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryIncentiveProgram.SerializeToString,
                response_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryIncentiveProgramResponse.FromString,
                )
        self.CurrentRates = channel.unary_unary(
                '/umee.incentive.v1.Query/CurrentRates',
                request_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryCurrentRates.SerializeToString,
                response_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryCurrentRatesResponse.FromString,
                )
        self.ActualRates = channel.unary_unary(
                '/umee.incentive.v1.Query/ActualRates',
                request_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryActualRates.SerializeToString,
                response_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryActualRatesResponse.FromString,
                )
        self.LastRewardTime = channel.unary_unary(
                '/umee.incentive.v1.Query/LastRewardTime',
                request_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryLastRewardTime.SerializeToString,
                response_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryLastRewardTimeResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Params(self, request, context):
        """Params queries the parameters of the x/incentive module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def TotalBonded(self, request, context):
        """TotalBonded queries the sum of all bonded collateral uTokens.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def TotalUnbonding(self, request, context):
        """TotalUnbonding queries the sum of all unbonding collateral uTokens.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AccountBonds(self, request, context):
        """AccountBonds queries all bonded collateral and unbondings associated with an account.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def PendingRewards(self, request, context):
        """PendingRewards queries unclaimed incentive rewards associated with an account.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CompletedIncentivePrograms(self, request, context):
        """CompletedIncentivePrograms queries for all incentives programs that have been passed
        by governance, and either run to completion or expired immediately due to not being funded.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def OngoingIncentivePrograms(self, request, context):
        """OngoingIncentivePrograms queries for all incentives programs that have been passed
        by governance, funded, and started but not yet completed.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpcomingIncentivePrograms(self, request, context):
        """UpcomingIncentivePrograms queries for all incentives programs that have been passed
        by governance, but not yet started. They may or may not have been funded.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def IncentiveProgram(self, request, context):
        """IncentiveProgram queries a single incentive program by ID.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CurrentRates(self, request, context):
        """CurrentRates queries the hypothetical return of a bonded uToken denomination
        if current incentive rewards continued for one year. The response is an sdk.Coins
        of base token rewards, per reference amount (usually 10^exponent of the uToken.)
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ActualRates(self, request, context):
        """ActualRates queries the hypothetical return of a bonded uToken denomination
        if current incentive rewards continued for one year. The response is an sdk.Dec
        representing an oracle-adjusted APY.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def LastRewardTime(self, request, context):
        """LastRewardTime queries the last block time at which incentive rewards were calculated.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryParams.FromString,
                    response_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'TotalBonded': grpc.unary_unary_rpc_method_handler(
                    servicer.TotalBonded,
                    request_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryTotalBonded.FromString,
                    response_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryTotalBondedResponse.SerializeToString,
            ),
            'TotalUnbonding': grpc.unary_unary_rpc_method_handler(
                    servicer.TotalUnbonding,
                    request_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryTotalUnbonding.FromString,
                    response_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryTotalUnbondingResponse.SerializeToString,
            ),
            'AccountBonds': grpc.unary_unary_rpc_method_handler(
                    servicer.AccountBonds,
                    request_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryAccountBonds.FromString,
                    response_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryAccountBondsResponse.SerializeToString,
            ),
            'PendingRewards': grpc.unary_unary_rpc_method_handler(
                    servicer.PendingRewards,
                    request_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryPendingRewards.FromString,
                    response_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryPendingRewardsResponse.SerializeToString,
            ),
            'CompletedIncentivePrograms': grpc.unary_unary_rpc_method_handler(
                    servicer.CompletedIncentivePrograms,
                    request_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryCompletedIncentivePrograms.FromString,
                    response_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryCompletedIncentiveProgramsResponse.SerializeToString,
            ),
            'OngoingIncentivePrograms': grpc.unary_unary_rpc_method_handler(
                    servicer.OngoingIncentivePrograms,
                    request_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryOngoingIncentivePrograms.FromString,
                    response_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryOngoingIncentiveProgramsResponse.SerializeToString,
            ),
            'UpcomingIncentivePrograms': grpc.unary_unary_rpc_method_handler(
                    servicer.UpcomingIncentivePrograms,
                    request_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryUpcomingIncentivePrograms.FromString,
                    response_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryUpcomingIncentiveProgramsResponse.SerializeToString,
            ),
            'IncentiveProgram': grpc.unary_unary_rpc_method_handler(
                    servicer.IncentiveProgram,
                    request_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryIncentiveProgram.FromString,
                    response_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryIncentiveProgramResponse.SerializeToString,
            ),
            'CurrentRates': grpc.unary_unary_rpc_method_handler(
                    servicer.CurrentRates,
                    request_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryCurrentRates.FromString,
                    response_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryCurrentRatesResponse.SerializeToString,
            ),
            'ActualRates': grpc.unary_unary_rpc_method_handler(
                    servicer.ActualRates,
                    request_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryActualRates.FromString,
                    response_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryActualRatesResponse.SerializeToString,
            ),
            'LastRewardTime': grpc.unary_unary_rpc_method_handler(
                    servicer.LastRewardTime,
                    request_deserializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryLastRewardTime.FromString,
                    response_serializer=umee_dot_incentive_dot_v1_dot_query__pb2.QueryLastRewardTimeResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'umee.incentive.v1.Query', rpc_method_handlers)
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
        return grpc.experimental.unary_unary(request, target, '/umee.incentive.v1.Query/Params',
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryParams.SerializeToString,
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def TotalBonded(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/umee.incentive.v1.Query/TotalBonded',
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryTotalBonded.SerializeToString,
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryTotalBondedResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def TotalUnbonding(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/umee.incentive.v1.Query/TotalUnbonding',
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryTotalUnbonding.SerializeToString,
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryTotalUnbondingResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AccountBonds(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/umee.incentive.v1.Query/AccountBonds',
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryAccountBonds.SerializeToString,
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryAccountBondsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def PendingRewards(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/umee.incentive.v1.Query/PendingRewards',
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryPendingRewards.SerializeToString,
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryPendingRewardsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CompletedIncentivePrograms(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/umee.incentive.v1.Query/CompletedIncentivePrograms',
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryCompletedIncentivePrograms.SerializeToString,
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryCompletedIncentiveProgramsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def OngoingIncentivePrograms(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/umee.incentive.v1.Query/OngoingIncentivePrograms',
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryOngoingIncentivePrograms.SerializeToString,
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryOngoingIncentiveProgramsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpcomingIncentivePrograms(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/umee.incentive.v1.Query/UpcomingIncentivePrograms',
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryUpcomingIncentivePrograms.SerializeToString,
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryUpcomingIncentiveProgramsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def IncentiveProgram(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/umee.incentive.v1.Query/IncentiveProgram',
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryIncentiveProgram.SerializeToString,
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryIncentiveProgramResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CurrentRates(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/umee.incentive.v1.Query/CurrentRates',
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryCurrentRates.SerializeToString,
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryCurrentRatesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ActualRates(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/umee.incentive.v1.Query/ActualRates',
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryActualRates.SerializeToString,
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryActualRatesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def LastRewardTime(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/umee.incentive.v1.Query/LastRewardTime',
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryLastRewardTime.SerializeToString,
            umee_dot_incentive_dot_v1_dot_query__pb2.QueryLastRewardTimeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)