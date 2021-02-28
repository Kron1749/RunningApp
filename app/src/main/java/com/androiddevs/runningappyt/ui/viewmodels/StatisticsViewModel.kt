package com.androiddevs.runningappyt.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.androiddevs.runningappyt.repositories.MainRepository
import javax.inject.Inject

class StatisticsViewModel @ViewModelInject constructor(
    val mainRepository:MainRepository
):ViewModel() {

    val totalTimeRun = mainRepository.getTotalMillis()
    val totalDistance = mainRepository.getTotalDistance()
    val totalAvgSpeed = mainRepository.getTotalAvgSpeed()
    val totalCaloriesBurned = mainRepository.getTotalCaloriesBurned()

    val runsSortedByDate = mainRepository.getAllRunSortedByDate()
}